package kr.co.ureca.s3aop.config;

import kr.co.ureca.s1di.controller.DIController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component //bean에 등록
public class AOPConfig {
    public static final Logger logger = LoggerFactory.getLogger(DIController.class);

    //모든 return 타입/ kr.co.ureca.모든 클래스.controller -> class, method, argument
    @Before("execution(* kr.co.ureca.*.controller.*.*(..))")
    public void aopBefore(JoinPoint joinPoint){
        logger.info(">>> AOP before start <<<");
        logger.info(joinPoint.toString()); //어떤 정보?
        logger.info("AOP Before time: " + new Date().toString()); //어떤 정보?

        logger.info(">>> AOP before end <<<");

    }//aopBefore

    @After("execution(* kr.co.ureca.*.controller.*.*(..))")
    public void aopAfter(JoinPoint joinPoint){
        logger.info(">>> AOP after start <<<");
        logger.info(joinPoint.toString());
        logger.info("AOP After time: " + new Date().toString());
        logger.info(">>> AOP after end <<<");
    }
}
