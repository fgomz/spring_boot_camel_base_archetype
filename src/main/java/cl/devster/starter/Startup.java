package cl.devster.starter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Startup {

	private final static Log LOGGER = LogFactory.getLog(Startup.class);

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
}