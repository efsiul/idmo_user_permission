package com.idmo_user_permission.idmo_user_permission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestIdmoUserPermissionApplication {

	public static void main(String[] args) {
		SpringApplication.from(IdmoUserPermissionApplication::main).with(TestIdmoUserPermissionApplication.class).run(args);
	}

}
