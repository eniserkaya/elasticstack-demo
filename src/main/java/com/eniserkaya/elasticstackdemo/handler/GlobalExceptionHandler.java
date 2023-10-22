package com.eniserkaya.elasticstackdemo.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    public String handleException(final Exception exception) {
        log.error("Runtime exception -------------- ", exception);
        return "HATA";
    }
}
