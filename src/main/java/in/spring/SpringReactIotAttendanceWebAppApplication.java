package in.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringReactIotAttendanceWebAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringReactIotAttendanceWebAppApplication.class, args);
	}
}
