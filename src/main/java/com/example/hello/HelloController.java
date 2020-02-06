package com.example.hello;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public ResponseEntity<String> getData() {

		return new ResponseEntity<>("Hello World", HttpStatus.OK);

	}
}
