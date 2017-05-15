package ru.hetech.pfr.service;

import ru.hetech.pfr.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
