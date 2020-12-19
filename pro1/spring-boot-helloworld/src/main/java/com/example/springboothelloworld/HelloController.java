package com.example.springboothelloworld;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello() {
        result.put("name", "Stephen");
        result.put("city", "San Jose");
        return result;
    }
}
