package springboot.aop;

import org.springframework.stereotype.Service;

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
        System.out.println("Processing time: " + (end - start) + "ms");
    }

    @Override
    public void publishEvent() {
        long start = System.currentTimeMillis();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("publishEvent");

        long end = System.currentTimeMillis();
        System.out.println("Processing time: " + (end - start) + "ms");
    }
}