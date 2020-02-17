package edu.cursor.service;

import edu.cursor.domain.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);

    List<User> findAll();

    User createUser(User user);

    void updateUserById(Long id, User user);

    void removeUserById(Long id);
}
