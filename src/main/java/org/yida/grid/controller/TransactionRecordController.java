package org.yida.grid.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionRecordController {

    @PostMapping("/hello")
    public String hello() {
        return "Hello";
    }
}