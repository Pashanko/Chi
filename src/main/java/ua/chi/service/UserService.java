package ua.chi.service;

import ua.chi.entity.User;

public interface UserService {
    User registerUser(User user);
    User findByUsername(String username);
}