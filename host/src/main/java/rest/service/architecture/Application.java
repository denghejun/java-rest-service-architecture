package rest.service.architecture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("rest.service.architecture.**.model")
public class Application extends SpringBootServletInitializer {
    public static void main(    String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
