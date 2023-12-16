package com.training.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.training.springboot.entity.Examples;
import com.training.springboot.service.ExampleService;

@RestController
@RequestMapping("/api")
public class ExampleController<T> {

	@Autowired
	ExampleService exampleService;
	
	@PostMapping("/save")
	public ResponseEntity<Examples> saveExample(@RequestBody Examples example) {
		// Cars savedCars = (Cars) oneService.save(cars);
		try {
			Examples savedExample = exampleService.save(example);
			return new ResponseEntity<Examples>(savedExample, HttpStatus.CREATED);
		} catch (Exception e) {
			throw new HttpClientErrorException((HttpStatusCode) e);
		}

	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Examples>> FindAll() {
		// Cars savedCars = (Cars) oneService.save(cars);
		return new ResponseEntity<List<Examples>>(exampleService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<Optional<Examples>> FindById(@PathVariable Long id) {

		Optional<Examples> example = exampleService.findById(id);
		return new ResponseEntity<Optional<Examples>>(example, HttpStatus.OK);
	}

	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<HttpStatus> DeleteById(@PathVariable Long id) {
		try {
			exampleService.deleteById(id);
			boolean ishave = exampleService.existsById(id);
			if (ishave)
				return new ResponseEntity<HttpStatus>(HttpStatus.GONE);
			else
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);

		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}