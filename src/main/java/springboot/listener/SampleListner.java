package springboot.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleListner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("================================");
        System.out.println("안녕하세요");
        System.out.println("================================");
    }
}

