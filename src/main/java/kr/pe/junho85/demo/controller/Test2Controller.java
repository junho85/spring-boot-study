package kr.pe.junho85.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class Test2Controller {
    public Test2Controller() {
        log.info("====== TestController 생성자");
    }

    @GetMapping("/test2/haha")
    public void test2() {

    }
}
