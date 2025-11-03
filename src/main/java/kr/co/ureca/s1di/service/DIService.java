package kr.co.ureca.s1di.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DIService {
    public static final Logger logger = LoggerFactory.getLogger(DIService.class);

    public Map<String, String> diTest(){
        logger.info(">>> di test<<<");
        HashMap<String, String> map = new HashMap<>();
        map.put("isSuccess", "true");
        map.put("message", "this is di test..");
        return map;
    }
}
