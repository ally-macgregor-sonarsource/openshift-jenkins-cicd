package com.portal.openshiftjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenshiftjenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftjenkinsApplication.class, args);

		try (PrintWriter writer = new PrintWriter(process.getOutputStream())) {
        	String contents = file.contents();
         	writer.write(new Gson().toJson(new MyObject(contents)));
  		 	writer.flush();
  		 	writer.close();
		}
	}

  //TODO: Continue improvements here...
}
