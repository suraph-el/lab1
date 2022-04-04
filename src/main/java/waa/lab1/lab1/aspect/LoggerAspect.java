package waa.lab1.lab1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import waa.lab1.lab1.domain.Logger;
import waa.lab1.lab1.service.LoggerService;

import java.time.LocalDate;
import java.time.LocalTime;

@Aspect
@Component
public class LoggerAspect {
    @Autowired
    LoggerService loggerService;



    @Pointcut("execution(* waa.lab1.lab1.service.CommentService.*(..)) || execution(* waa.lab1.lab1.service.PostService.*(..)) || execution(* waa.lab1.lab1.service.UserService.*(..))")
    public void logMeExecution(){}

    @After("logMeExecution()")
    public void logAfterExecution(JoinPoint joinPoint){
        Logger logger = new Logger();
        logger.setDate(LocalDate.now());
        logger.setTime(LocalTime.now());
        logger.setOperation("After" +  joinPoint.getSignature().getName());
        loggerService.addLog(logger);

    }
    @Around("logMeExecution()")
    public void logMeExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long executionStartTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long executionEndTime = System.currentTimeMillis();
        System.out.println("Execution time of " + proceedingJoinPoint.getSignature().getName() + " is "
                + (executionEndTime-executionStartTime));
    }
}
