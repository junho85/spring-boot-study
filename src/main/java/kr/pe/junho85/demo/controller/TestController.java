package kr.pe.junho85.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class TestController {

    @GetMapping("/tests")
    public String test(Model model) {
        log.info("hello world log log");
        return "hello";
    }
}
