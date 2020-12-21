package com.training.ykb.injection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope
public class MyUsingBean {

	@Autowired
	private MyBean myBean;

	private final MyBean myBean2;

	private MyBean myBean3;


	@Autowired
	public MyUsingBean(final MyBean myBeanParam) {
		this.myBean2 = myBeanParam;
	}

	@Autowired
	public void xyz(final MyBean myBeanparam) {
		this.myBean3 = myBeanparam;
	}

	@PostConstruct
	public void init() {
		this.myBean.execute();
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}
	
	public void proc() {
		this.myBean.execute();
	}

}
