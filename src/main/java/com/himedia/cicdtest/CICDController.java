package com.himedia.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

    @GetMapping("/")
    public @ResponseBody  String index() {
        return "<h1>Hello World</h1>";
    }
}
