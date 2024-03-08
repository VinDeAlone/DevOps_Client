package com.devops.demoService.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.demoService.dtos.Demo;
import com.devops.demoService.dtos.RequestDemoDTO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/demo")
public class DemoController {
	
	public static List<Demo> list = new ArrayList<>();
	
	@GetMapping
	public ResponseEntity<?> getAllDemos(){
		return ResponseEntity.status(HttpStatus.OK)
				.body(list)
				;
	}
	
	@PostMapping
	public ResponseEntity<?> createDemo(@RequestBody RequestDemoDTO dto){
		
		int lid = DemoController.list.size() + 1;
		Demo d = new Demo();
		d.setId(lid);
		d.setName(dto.getName());
		d.setAge(dto.getAge());
		
		DemoController.list.add(d);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body("Uploaded successfully !!!")
				;
	}

}
