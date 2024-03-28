package springboot.testlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleTestController {
    @Autowired
    private SampleTestService service;
    @GetMapping("/hello")
    public String hello() {
        return "Hello " + service.getName();
    }
}
