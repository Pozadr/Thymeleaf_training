package pl.pozadr.thymeleafhello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloApp {

    @GetMapping("/hello")
    public String get() {
        return "hello";
    }
}
