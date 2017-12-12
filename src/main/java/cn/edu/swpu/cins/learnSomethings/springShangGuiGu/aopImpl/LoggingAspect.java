package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.aopImpl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 把这个类声明为一个切面，
 * 首先声明放到IOC 容器中，@Component
 * 再声明为一个切面,@Aspect
 * Created by miaomiao on 17-9-18.
 *前置通知，后置通知，返回通知，异常通知，环绕通知
 */
@Order(1)   //使用@Oreder注解指定切面的优先级，值越小优先级越高
@Aspect
@Component
public class LoggingAspect {

    /**
     * 定义一个方法，用于声明切入点表达式，一般地，方法中不需要填入代码
     * 使用@JoinPoint来声明切入点表达式，其他类也可以引用
     * AspectJ 表达式
     */
    @Pointcut("execution(* cn.edu.swpu.cins.learnSomethings.springShangGuiGu.aopImpl.*.*(int,int))")
    public void declareJoinPointExpression(){}



    //后置通知：在目标方法执行后（无论是否发生异常），执行通知
    //不能访问目标方法执行的结果
    @After("declareJoinPointExpression()")
//    @After("execution(* cn.edu.swpu.cins.learnSomethings.springShangGuiGu.aopImpl.*.*(int,int))")
    public void AfterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method "+ methodName +" ends ");
    }

    //前置通知
    @Before("declareJoinPointExpression()")
//    @Before("execution(* cn.edu.swpu.cins.learnSomethings.springShangGuiGu.aopImpl.*.*(int,int))")
    public void BeforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method "+ methodName +" begins " + args);
    }

    /**
     * 返回通知：在方法正常结束执行的代码
     * 返回通知是可以访问到目标方法的返回值
     */
    @AfterReturning(value = "declareJoinPointExpression()",
                   returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();

        System.out.println("The method "+ methodName +" ends with " + result);
    }

    /**
     * 异常通知：
     * 在目标方法出现异常时执行的代码
     */
    @AfterThrowing(value = "declareJoinPointExpression()",
                  throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method "+ methodName +" occurs exception" + ex);
    }


    /**
     * 不常用，但是可以包含上面的所有通知
     * 环绕通知 需要携带ProceedingJoinPoint 类型参数
     * 类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法
     * 必须有返回值，返回值为目标方法的返回值

    @Around("execution(* cn.edu.swpu.cins.learnSomethings.springShangGuiGu.aopImpl.*.*(int,int))")
    public Object aroundMethod(ProceedingJoinPoint pJd){
        Object result = null;
        String methodName = pJd.getSignature().getName();
        try {
            //前置通知
            System.out.println("The method " + methodName+" begins with " + Arrays.asList(pJd.getArgs()));
            //执行目标方法
            result = pJd.proceed();
            //返回通知
            System.out.println("The method " + methodName+" ends with" +Arrays.asList(pJd.getArgs()));
        }catch (Throwable e){
            //异常通知
            System.out.println("The method occurs exception :" +e);
            throw new RuntimeException(e);
        }

        //后置通知
        System.out.println("The method "+methodName+" ends");
        return result;
    }
*/

}
