package kr.co.ureca.s2ioc.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BallpenService implements PenService {
    @Override
    public Map<String, String> write() {
        //logger.info(">>> di test<<<");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", "ballpen");
        map.put("ispencil", "false");
        map.put("isballpen", "true");

        return map;
    }
}
