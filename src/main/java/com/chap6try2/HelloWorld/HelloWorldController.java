package com.chap6try2.HelloWorld;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class HelloWorldController {

    //Hello Worldを表示
    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello World!!!!!";
    }

    ///こんにちは!!!を表示
    @GetMapping("/helloJapanese")
    public String helloJapanese() {
        return "こんにちは!!!";
    }

    //数字12345を表示
    @GetMapping("/number")
    public Integer number() {
        return 12345;
    }

    //Listの中身namesを表示
    @GetMapping("/names")
    public List<String> names() {
        List<String> names = List.of("tanaka","senga","mitoma");
        return names;
    }

    //Nameクラスを表示
    @GetMapping("/names2")
    public Name names2() {
        return new Name("shohei", "ohtani");
    }

    //Nameクラス（吉田選手）を表示
    @GetMapping("/namesyoshi")
    public Name namesyoshi() {
        return new Name("masa","yoshida");
    }


    //現在時刻を表示（LocalDateTIme)
    @GetMapping("/LocalDateTime")
    public LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    //現在時刻を表示（ZonedDateTime)
    @GetMapping("/ZonedDateTime")
    public ZonedDateTime getCurrentDateTime2() {
        return ZonedDateTime.now();
    }


}
