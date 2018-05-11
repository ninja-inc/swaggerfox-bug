package com.example.swaggerfoxbug;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class Controller {
	@GetMapping("/findAnimal")
	public ResponseEntity<Animal> findAnimal() {
		return ResponseEntity.ok(new Animal());
	}

	@GetMapping("/findBook")
	public ResponseEntity<Book> findBook() {
		return ResponseEntity.ok(new Book());
	}
}
