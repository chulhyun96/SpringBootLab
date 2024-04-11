package springboot.eventpulisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher myEventPublisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        myEventPublisher.publishEvent(new MyEvent(this, 100));
        myEventPublisher.publishEvent(new UserRegisteredEvent(this, "chulhyeon"));

    }
}
//1. 발생시킬 이벤트를 정의한다.
//2. 이벤트를 서비스하는 로직을 작성한다.
//3. 이벤트 핸들러를 구현한다.
