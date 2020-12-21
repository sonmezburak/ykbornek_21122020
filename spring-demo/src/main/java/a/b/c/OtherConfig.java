package a.b.c;

import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {

	public OtherBeanA otherBeanA() {
		return new OtherBeanA();
	}
}
