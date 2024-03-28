package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(LabApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        SpringApplication.run(LabApplication.class,args);
    }
}