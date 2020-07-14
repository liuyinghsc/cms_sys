package com.cms.hello;

import org.springframework.web.bind.annotation.*;
//返回json数据
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        HelloWord hello = new HelloWord();
        return hello.hellotest();
    }

    @PostMapping("/gethello")
    public HelloWord hello1(@RequestBody HelloWord hello){
        return hello;
    }

    @GetMapping(value = "/hello/{s}")
    public HelloWord hello2(@PathVariable String s) {
        HelloWord helloWord = new HelloWord();
        helloWord.setS(s);
        return helloWord;
    }
    @GetMapping(value = "/rehello")
    public HelloWord hello3(@RequestParam("s") String s) {
        HelloWord helloWord = new HelloWord();
        helloWord.setS(s);
        return helloWord;
    }
}
