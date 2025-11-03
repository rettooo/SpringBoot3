package kr.co.ureca.s2ioc.service;

import kr.co.ureca.s1di.service.DIService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PencilService implements PenService {
    @Override
    public Map<String, String> write() {
        //logger.info(">>> di test<<<");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", "PencilService");
        map.put("ispencil", "true");
        map.put("isballpen", "false");

        return map;
    }
}
