package net.javaguides.springbppt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}, scanBasePackages={"java"})
@ComponentScan({"repository"})
@EntityScan("domain")
@EnableJpaRepositories(basePackages = "java")

//, entityManagerFactoryRef = "sessionFactory"
//@ComponentScan(basePackageClasses = DriverController.class)
//@ComponentScan(basePackageClasses = HealthController.class)
//@ComponentScan(basePackageClasses = Driver.class)
//@ComponentScan(basePackageClasses = DriverRepository.class)
//@ComponentScan(basePackageClasses = DriverService.class)
public class SpringbpptBackendApplication extends SpringBootServletInitializer {
//the main program
	public static void main(String[] args) {
	SpringApplication.run(SpringbpptBackendApplication.class,args);


	}

}
