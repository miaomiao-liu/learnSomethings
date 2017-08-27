package cn.edu.swpu.cins.learnSomethings;

import cn.edu.swpu.cins.learnSomethings.collection.TestGeneric;
import cn.edu.swpu.cins.learnSomethings.jedis.JedisDemo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentGradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentGradeApplication.class, args);
	}


}
