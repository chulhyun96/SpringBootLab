package springboot.eventpulisher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyEventHandler {
    @EventListener
    @Async
    public void AnotherHandler1(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ANOTHER HANDLER1: " + event.getData());
    }
    @EventListener
    @Async
    public void AnotherHandler2(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ANOTHER HANDLER2: " + event.getData());
    }

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void AnotherHandler3(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("Get the Resource: " + event.getSource());
        System.out.println("Get the Class: " + event.getClass());
        System.out.println("Get the Data: " + event.getData());
    }
}
