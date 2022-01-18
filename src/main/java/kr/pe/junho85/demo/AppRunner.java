package kr.pe.junho85.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppRunner implements ApplicationRunner {
    @Value("${test.host}")
    String testHost;

    @Value("${test.base-url}")
    String testBase;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(testHost);
        System.out.println(testBase);
        log.info("test");
    }
}
