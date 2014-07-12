package net.contee.sample.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by contee on 2014/07/13.
 */

@Controller
@EnableAutoConfiguration
public class SampleController {


    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }


}
