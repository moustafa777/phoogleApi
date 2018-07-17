package com.mum.wap.dao;

import com.mum.wap.service.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAO {

	Map<String, User> usersDb = new HashMap<>();
	{
		usersDb.put("admin", new User(1, "Admin", "1234"));
		usersDb.put("user1", new User(2, "user1", "123"));
		usersDb.put("user2", new User(3, "user2", "123"));
	}

	public void addUser(User user) {
		usersDb.put(user.getUsername().toLowerCase(), user);
	}

	public void deleteUser(String userName) {
		usersDb.remove(userName);
	}

	public void updateUser(User user) {
		usersDb.put(user.getUsername(), user);
	}

	public List<User> getAllUsers() {
		return new ArrayList<>(usersDb.values());
	}

	public User getUserById(String userName) {
		return usersDb.get(userName);
	}

	public User getUserByCredential(String userName, String password) {
		User resultUser;
		resultUser = usersDb.get(userName.toLowerCase());
		if(resultUser.getPassword().equals(password))
			return resultUser;
		else
			return null;
	}

	public int genId() {
		return usersDb.size() + 1;
	}
}
