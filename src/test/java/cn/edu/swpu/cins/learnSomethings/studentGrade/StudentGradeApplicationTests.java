package cn.edu.swpu.cins.learnSomethings.studentGrade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentGradeApplicationTests {

	@Test
	public void contextLoads() {
	}

	public static void print(int index, Object object){
		System.out.println(String.format("{%d}, %s",index,object.toString()));
	}

	public static void testString(){
		String username = "miaomiao";
		String email = "1242019260@qq.com124";

		/**
		 * 判断邮箱格式是否正确
		 * 1）@必须在.的前面
		 * 2）后缀必须是.com
		 *
		 **/
		int index1 = email.indexOf("@");
		int index2 = email.indexOf(".");
		String suffix = email.substring(index2);

		if(index1<index2 && suffix.equals(".com")){
			print(1,"邮箱格式正确！");
		}else
			print(1,"邮箱格式不正确！");

		print(2,"邮箱长度为："+email.length());
		print(3,"420字符串在邮箱中出现的位置："+email.indexOf("420"));
		print(4,"0在邮箱中最后一次出现的位置："+email.lastIndexOf("0"));
		print(5,"从10到16h位置的子字符串："+email.substring(10,16));
		print(6,"将邮箱中的小写字母转换为大写："+email.toUpperCase());

		byte b[] = email.getBytes();
		for(int i=0;i<email.length() ;i++){
			print(7,"转化为字节数组："+b[i]+" ");

		}

		//判断邮箱中有几个0
		int num = 0;
		for(int i=0 ; i<email.length(); i++){
			if(email.charAt(i) == '0'){
				num++;
			}
		}
		print(8,"邮箱中一共有"+num+"个0！");

	}

	public static void testStringBuilder(){
		StringBuilder str = new StringBuilder();
		str.append("rwlngiptwrgerakh");

		print(1,"str:"+str);

		str.append("miaomiao");
		print(2,"str加上一段字符："+str);

		str.insert(10," ");
		print(3,"在str字符串中位置10加上一个空格："+str);
	}

	public static void main(String[] args){

		testString();
		testStringBuilder();

	}


}
