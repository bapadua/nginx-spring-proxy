package io.github.bapadua.proxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "hello world from proxy";
    }

    @GetMapping("/buddy")
    public String helloBuddy(@RequestParam(value = "name", defaultValue = "John Doe") String name) {
        return String.format("Hello %s", name);
    }
}
