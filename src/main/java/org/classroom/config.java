package org.classroom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
	@Bean
	public ClassRoom getClassRoom() {
		return new ClassRoom();
	}
	
}
