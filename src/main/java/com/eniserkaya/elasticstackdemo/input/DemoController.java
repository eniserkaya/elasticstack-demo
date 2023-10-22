package com.eniserkaya.elasticstackdemo.input;

import com.eniserkaya.elasticstackdemo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/throwException")
    public void throwExceptionForDemo() {
        demoService.throwExceptionServiceForDemo();
    }
}
