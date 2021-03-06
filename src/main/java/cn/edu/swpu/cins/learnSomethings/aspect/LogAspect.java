package cn.edu.swpu.cins.learnSomethings.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by miaomiao on 17-8-24.
 */
@Aspect
@Component
@Configuration
public class LogAspect {

    private Log logger = LogFactory.getLog(LogAspect.class);

    @Pointcut("execution(public * cn.edu.swpu.cins.learnSomethings.collection.*.*(..))")
    public void logAspect(){}

    @Before("logAspect()")
    public void Before(JoinPoint joinPoint){
        System.out.println ("切面before执行了。。。。");
        Signature signature = joinPoint.getSignature();
        String method = signature.getDeclaringTypeName() + '.' + signature.getName();
        logger.info("calling : " + method);
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            logger.info("arg : " + arg);
        }
    }

    @After("logAspect()")
    public void After() {
        System.out.println ("切面after执行了。。。。");
//        logger.info("service return : " + ret);
    }
}
