package com.logging.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LoggingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LoggingApplication.class, args);

		Test test = context.getBean(Test.class);

		test.TestLogging();
	}
}
