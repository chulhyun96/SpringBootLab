package springboot.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentAppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext ac;

    @Autowired
    BookRepository repository;

    @Value("${app.name}")
    String appName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = ac.getEnvironment();
        String property = environment.getProperty("app.name");
        System.out.println("property = " + property);
        System.out.println("appName = "  + appName);
    }
}
