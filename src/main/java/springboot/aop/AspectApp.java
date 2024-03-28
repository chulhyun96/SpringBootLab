package springboot.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//클라이언트
@Component
public class AspectApp implements ApplicationRunner {
    @Autowired
    EventService service;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        service.createEvent();
        service.publishEvent();
    }
}
