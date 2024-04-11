package springboot.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyEnvController {
    @Autowired
    private EnvironmentService env;

    public void showMyAppName() {
        String activeProfile = env.getActiveProfile();
        String appName = env.getAppName();
        System.out.println("activeProfile = " + activeProfile);
        System.out.println("appName = " + appName);
    }
}
