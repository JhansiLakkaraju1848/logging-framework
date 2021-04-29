package com.logging.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static net.logstash.logback.argument.StructuredArguments.keyValue;

@Component
@Slf4j
public class Test {
	public void TestLogging() {
		log.info("Some test message: {}", "1234", keyValue("partnerId", 1234), keyValue("anotherId", "33553"));
	}
}
