package kr.co.ureca.s2ioc.controller;

import kr.co.ureca.s1di.controller.DIController;
import kr.co.ureca.s2ioc.service.PenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IOCTestController {

    public static final Logger logger = LoggerFactory.getLogger(IOCTestController.class);

    @Autowired
    private PenService service;

    @GetMapping(value = "/ioctest")
    @ResponseBody
    public Map<String, String> iocTest(){
        logger.info("ioc Test입니다.");
        Map<String, String> map = service.write();

        return map;

    }

}
