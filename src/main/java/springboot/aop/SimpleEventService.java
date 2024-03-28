package springboot.aop;

import org.springframework.stereotype.Service;

//AOP
@Service
public class SimpleEventService implements EventService{

    @Override
    public void createEvent() {
        long start = System.currentTimeMillis();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("createEvent");

        long end = System.currentTimeMillis();

    }

    @Override
    public void publishEvent() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("publishEvent");
    }
}