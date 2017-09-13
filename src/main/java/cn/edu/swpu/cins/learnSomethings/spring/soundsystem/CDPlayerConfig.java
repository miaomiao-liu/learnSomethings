package cn.edu.swpu.cins.learnSomethings.spring.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by miaomiao on 17-9-10.
 */
@Configuration
//@ImportResource("classpath:CDPlayerConfig.xml")
@ComponentScan    //扫描所在包中所有有@Component的类，并加载为bean
public class CDPlayerConfig {

}
