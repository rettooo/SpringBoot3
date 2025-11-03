package kr.co.ureca.s1di.controller;

import kr.co.ureca.s1di.service.DIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

//@Configuration
//@Component //bean 주입
//@Controller // result mapping

@Controller
public class DIController {

    public static final Logger logger = LoggerFactory.getLogger(DIController.class);

    //1. DI 추가 -> 옛날 방식
    //private DIService service = new DIService(); //개발자가 객체 주입을 해야함.

    //2. 생성자에 의한 의존성 주입
    // 생성자가 실행될때 ->DiService가 필요함. => Spring이 생성하고 제공한다.
    // 공식적으로 권장되는 방식이다.
    // why? 의존객체(DIService)가 없으면, DIController 생성 불가
    private DIService service;

    public DIController(DIService service) {
        this.service = service;
    }


    @GetMapping(value="/ditest")
    @ResponseBody //response가 html body 부분임
    public Map<String, String> diTest(){ //객체 리턴
//        logger.info("1. 17 line 개발자가 DIService 객체 주입 ");
        logger.info("2.생성자에 의한 자동 의존성 주입 ");
        Map<String, String> map = service.diTest();
        return map;
    }

}
