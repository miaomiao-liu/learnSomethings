package cn.edu.swpu.cins.learnSomethings.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by miaomiao on 17-8-15.
 */
public class JedisDemo1 {

    @Test
    public void demo1(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("name","miao");

        String value = jedis.get("name");
        System.out.println(value);
        jedis.close();
    }
}
