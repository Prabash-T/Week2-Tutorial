
package com.example.Tutone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/home")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/info")
    public String info() {
        return "ver. 1.0.0";
    }

    @GetMapping("/Goodbye")
    public String Goodbye() {
        return "Goodbye World";
    }
}