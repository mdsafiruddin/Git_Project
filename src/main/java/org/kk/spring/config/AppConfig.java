package org.kk.spring.config;

import java.util.Date;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan("org.kk.spring.beans")
public class AppConfig {

  @Bean
	public Date createDate() {
		return new Date();
	}
}
