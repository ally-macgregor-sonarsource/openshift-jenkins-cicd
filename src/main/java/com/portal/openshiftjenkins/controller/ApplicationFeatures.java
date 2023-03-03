package com.portal.openshiftjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationFeatures {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationFeatures.class, args);

        //TODO: Review this!
		if ( 1 == 1)
		{
			//Bad code...
		}
	}

}
