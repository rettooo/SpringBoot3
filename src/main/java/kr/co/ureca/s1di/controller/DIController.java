package kr.co.ureca.s1di.controller;

import kr.co.ureca.s1di.service.DIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Configuration
//@Component //bean 주입
//@Controller // result mapping

@Controller
public class DIController {
    public static final Logger logger = LoggerFactory.getLogger(DIController.class);


}
