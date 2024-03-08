package com.devops.demoService;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devops.demoService.controllers.DemoController;
import com.devops.demoService.dtos.Demo;

@SpringBootApplication
public class DemoServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server started on port : 8122");
		
		Demo d1 = new Demo();
		d1.setId(1);
		d1.setName("Vinayak Jadhav");
		d1.setAge(25);
		
		Demo d2 = new Demo();
		d2.setId(2);
		d2.setName("Vilas Jadhav");
		d2.setAge(30);
		
		Demo d3 = new Demo();
		d3.setId(3);
		d3.setName("Krishna Jadhav");
		d3.setAge(35);
		
		DemoController.list.add(d1);
		DemoController.list.add(d2);
		DemoController.list.add(d3);
	}

}
