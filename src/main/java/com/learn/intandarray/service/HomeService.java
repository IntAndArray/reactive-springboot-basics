package com.learn.intandarray.service;


import reactor.core.publisher.Mono;

public interface HomeService {

    Mono<String> greetingsSupplier();
}
