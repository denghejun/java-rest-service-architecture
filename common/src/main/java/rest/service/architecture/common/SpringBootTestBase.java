package rest.service.architecture.common;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "rest.service.architecture",
        exclude = {DataSourceAutoConfiguration.class})
public class SpringBootTestBase {

}
