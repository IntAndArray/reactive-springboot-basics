package com.learn.intandarray.controller;

import com.learn.intandarray.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("greet")
    public Mono<String> greetings() {

        log.info("At controller ::: Thread :::: "  + Thread.currentThread().getName());
        return homeService.greetingsSupplier();
    }
}
