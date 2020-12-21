package com.training.ykb.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import a.b.c.OtherConfig;

@Configuration
@Import(OtherConfig.class)
//@Profile("dev")
public class MyConfig {
	
	@Bean
	//@Primary conflict anında bunu seçer
	@Qualifier("pokemon")	
	public MyUsingBean createMyUsingBean(final MyBean param) {
		return new MyUsingBean(param);
	}

}
