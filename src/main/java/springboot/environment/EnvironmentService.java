package springboot.environment;

import jakarta.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class EnvironmentService {
    @Resource
    private Environment env;

    public String getActiveProfile() {
        String[] activeProfiles = env.getActiveProfiles();
        return String.join(",", activeProfiles);
    }
    public String getAppName() {
        return env.getProperty("app.name");
    }
}
