package com.bw.ae.wb_admintest.ae_ae;

import org.springframework.stereotype.Service;

@Service
public class AeServiceDemoImpl implements AeServiceDemo {

	@Override
	public String sayHello(String name)
	{
		return "Hello " + name + "!";
	}
}