package com.example.rest.webservices.demorestfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserDetailsDAO {
	private static List<User> users = new ArrayList<>();
	private static int counter = 3;
	static {
		users.add(new User(1, "Suresh", new Date()));
		users.add(new User(2, "sample", new Date()));
		users.add(new User(3, "test", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getNumber() == null) {
			user.setNumber(++counter);
		}
		users.add(user);
		return user;

	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getNumber() == id) {
				return user;
			}
		}
		return null;
	}

	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getNumber() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
