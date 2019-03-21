package ru.sbrf.sberx;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@RequestMapping(path = "test", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConfigClientController {

    @Value("${message: Default Hellow World}")
    String message;

    @GetMapping("/foo")
    public String doTest(){
        return message;

    }
}
