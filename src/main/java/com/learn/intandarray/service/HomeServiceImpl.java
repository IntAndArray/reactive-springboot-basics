package com.learn.intandarray.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public Mono<String> greetingsSupplier() {

        log.info("At HomeService ::: Thread :::: "  + Thread.currentThread().getName());
        return Mono.just("String ReactiveX!!")
                .flatMap(data -> {
            log.info("At Flat map :::: Thread :::: " + Thread.currentThread().getName());
            log.info("==========================================================================================");
            return Mono.just("Hello !!! "+data);
        });
    }
}
