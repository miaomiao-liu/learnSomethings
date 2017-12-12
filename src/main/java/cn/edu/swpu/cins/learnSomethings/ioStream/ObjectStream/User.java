package cn.edu.swpu.cins.learnSomethings.ioStream.ObjectStream;

import java.io.Serializable;//该接口没有任何方法，是一个标志接口

/**
 * 如果不想让某属性参加序列化，可以在属性前面添加填入transient关键字
 * Created by miaomiao on 17-11-4.
 */
public class User implements Serializable{

    String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
