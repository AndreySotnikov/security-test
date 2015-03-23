package project.app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by andrey on 23.03.15.
 */
public class Launcher {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MainConfig.class,args);
    }
}
