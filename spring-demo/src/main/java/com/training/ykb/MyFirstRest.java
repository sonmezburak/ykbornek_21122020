package com.training.ykb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.ykb.injection.MyUsingBean;

import a.b.c.OtherBeanA;

@RestController
public class MyFirstRest {

	@Autowired
	@Qualifier("pokemon") // hem buraya ekledik hemde MyConfig classtaki ile aynı qualifier kullanmak lazım !!!
	private MyUsingBean mub;
	
	@Autowired
	private OtherBeanA oba;
	
	@GetMapping
	public String hello() {
		this.mub.proc();
		this.oba.xyz();
		return "Hello World";
	}
	
}
