package com.vault.test;

import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;

import io.pivotal.spring.cloud.vault.service.common.VaultServiceInfo;

public class VaultTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloudFactory cloudFactory = new CloudFactory();
		Cloud cloud = cloudFactory.getCloud();
		VaultServiceInfo myService = (VaultServiceInfo) cloud.getServiceInfo("MyService");
		myService.getUri();
		myService.getToken();
	}

}
