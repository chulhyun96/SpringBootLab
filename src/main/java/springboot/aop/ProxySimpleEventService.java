package springboot.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
// 프록시 클래스
@Primary // EventService를 구현하는 구현체가 2개이기 때문에
@Service
public class ProxySimpleEventService implements EventService{

    // RealSubject인 SimpleEventService의 프록시 클래스이기 때문에 의존성을 주입 받아준다
    @Autowired
    EventService simpleEventService;

    @Override
    public void createEvent() {
        long start = System.currentTimeMillis();
        simpleEventService.createEvent();
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " seconds took to create the event");
    }

    @Override
    public void publishEvent() {
        long start = System.currentTimeMillis();
        simpleEventService.publishEvent();
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " seconds took to publish the event");
    }
}