package cn.edu.swpu.cins.learnSomethings.jedis;

import org.junit.Test;
import redis.clients.jedis.BinaryClient;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Tuple;

/**
 * Created by miaomiao on 17-8-15.
 */
public class JedisDemo1 {

    public static void print(int index,Object object){
        System.out.println(String.format("%d,%s",index,object.toString()));
    }

    public static void main(String[] args){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.flushAll();

        jedis.set("hello","world");
        print(1,jedis.get("hello"));
        jedis.rename("hello","newHello");
        print(1,jedis.get("newHello"));
        //设置过期时间   运行后在命令行中查看
        jedis.setex("hello2",15,"world");

        //数值增加
        jedis.set("pv","100");
        jedis.incr("pv");
        print(2,jedis.get("pv"));
        jedis.incrBy("pv",5);
        print(2,jedis.get("pv"));

        //列表操作
        String listName = "listA";
        for (int i = 0;i < 10; i++){
            jedis.lpush(listName,"a"+String.valueOf(i));
        }
        print(3,jedis.lrange(listName,0,12));
        print(4,jedis.llen(listName));
        print(5,jedis.lindex(listName,3));
        print(6,jedis.lpop(listName));
        print(7,jedis.llen(listName));
        print(8,jedis.linsert(listName, BinaryClient.LIST_POSITION.AFTER,"a4","xx"));
        print(9,jedis.linsert(listName, BinaryClient.LIST_POSITION.BEFORE,"a4","bb"));
        print(10,jedis.lrange(listName,0,12));

        //hash
        String userKey = "user12";
        jedis.hset(userKey,"name","jim");
        jedis.hset(userKey,"age","12");
        jedis.hset(userKey,"phone","18618181818");
        print(11,jedis.hget(userKey,"name"));
        print(12,jedis.hgetAll(userKey));
        jedis.hdel(userKey,"phone");
        print(13,jedis.hgetAll(userKey));
        print(14,jedis.hkeys(userKey));
        print(15,jedis.hvals(userKey));
        print(16,jedis.hexists(userKey,"email"));
        print(17,jedis.hexists(userKey,"age"));

        //set
        String likeKeys1 = "newsLike1";
        String likeKeys2 = "newsLike2";
        for (int i = 0; i < 10; i++){
            jedis.sadd(likeKeys1,String.valueOf(i));
            jedis.sadd(likeKeys2,String.valueOf(i*2));
        }
        print(18,jedis.smembers(likeKeys1));
        print(19,jedis.smembers(likeKeys2));
        print(20,jedis.sinter(likeKeys1,likeKeys2));
        print(21,jedis.sunion(likeKeys1,likeKeys2));
        print(22,jedis.sdiff(likeKeys1,likeKeys2));
        print(23,jedis.sismember(likeKeys1,"5"));
        jedis.srem(likeKeys1,"5");
        print(24,jedis.smembers(likeKeys1));
        print(25,jedis.scard(likeKeys1));
        jedis.smove(likeKeys2,likeKeys1,"14");
        print(26,jedis.scard(likeKeys1));
        print(27,jedis.smembers(likeKeys1));
        print(28,jedis.smembers(likeKeys2));

        //ZSet
        String rankKey = "rankKey";
        jedis.zadd(rankKey,15,"jim");
        jedis.zadd(rankKey,60,"Ben");
        jedis.zadd(rankKey,90,"Mei");
        jedis.zadd(rankKey,80,"Lee");
        jedis.zadd(rankKey,75,"Lucy");
        print(29,jedis.zcard(rankKey));
        print(30,jedis.zcount(rankKey,"61","100"));
        print(31,jedis.zscore(rankKey,"Lucy"));
        jedis.zincrby(rankKey,2,"Lucy");
        jedis.zincrby(rankKey,2,"luc");
        print(32,jedis.zscore(rankKey,"Lucy"));
        print(33,jedis.zscore(rankKey,"luc"));
        //分数排名
        print(34,jedis.zrange(rankKey,0,2));
        print(35,jedis.zrevrange(rankKey,0,2));

        for (Tuple tuple : jedis.zrangeByScoreWithScores(rankKey,"0","100")){
            print(36,tuple.getElement()+":"+String.valueOf(tuple.getScore()));
        }
        //某人排名 顺序and逆序
        print(37,jedis.zrank(rankKey,"Ben"));
        print(38,jedis.zrevrank(rankKey,"Ben"));

//        JedisPool pool = new JedisPool();
//        for (int i = 0; i <100; i++){
//            Jedis j = pool.getResource();
//            j.get("a");
//            System.out.println("POOL"+i);
//            j.close();
//        }

        String setKey = "zset";
        jedis.zadd(setKey, 1, "a");
        jedis.zadd(setKey, 1, "b");
        jedis.zadd(setKey, 1, "c");
        jedis.zadd(setKey, 1, "d");
        jedis.zadd(setKey, 1, "e");

        // - + ？
        print(39, jedis.zlexcount(setKey, "-", "+"));
        print(40, jedis.zlexcount(setKey, "(b", "[d"));
        print(41, jedis.zlexcount(setKey, "[b", "[d"));
        jedis.zrem(setKey, "b");
        print(42, jedis.zrange(setKey, 0, 10));
        jedis.zremrangeByLex(setKey, "(c", "+");
        print(43, jedis.zrange(setKey, 0, 2));
    }




    @Test
    public void demo1(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("name","miao");

        String value = jedis.get("name");
        System.out.println(value);
        jedis.close();
    }
}
