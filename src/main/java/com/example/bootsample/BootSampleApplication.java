package com.example.bootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // (1)
public class BootSampleApplication {
  
  @GetMapping(path = "/") // (2)
  public String hello() {
      return "Hello world!";
  }
  
  @GetMapping(path = "/test") // (2)
  public String response() {
      return "testtest";
  }
  
	public static void main(String[] args) {
		SpringApplication.run(BootSampleApplication.class, args);
	}
}
