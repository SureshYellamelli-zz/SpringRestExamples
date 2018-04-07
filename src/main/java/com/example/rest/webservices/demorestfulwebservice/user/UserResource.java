package com.example.rest.webservices.demorestfulwebservice.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDetailsDAO userdao;

	@GetMapping("/getAllUsers")
	public List<User> retrieveAllUsers() {
		return userdao.findAll();
	}

	@GetMapping("/users/{id}")
	public User findUser(@PathVariable int id) {
		return userdao.findOne(id);
	}

	@PostMapping("/users")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		User savedUser = userdao.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUser.getNumber()).toUri();
		return ResponseEntity.created(location).build();
	}

}
