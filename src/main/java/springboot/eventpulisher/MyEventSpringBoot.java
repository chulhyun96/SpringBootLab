package springboot.eventpulisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MyEventSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(MyEventSpringBoot.class, args);
    }
}
