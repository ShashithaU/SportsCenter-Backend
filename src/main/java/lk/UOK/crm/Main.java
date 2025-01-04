package lk.UOK.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"lk.icet.crm", "lk/UOK/crm/repository"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}