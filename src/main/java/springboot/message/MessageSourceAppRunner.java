package springboot.message;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageSourceAppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(messageSource.getMessage("greeting", new String[]{"철현"}, Locale.getDefault()));
        System.out.println(messageSource.getMessage("greeting", new String[]{"철현"}, Locale.ENGLISH));
    }
    @PostConstruct
    public void setKorea() {
        Locale.setDefault(new Locale("ko","KR"));
    }
}
