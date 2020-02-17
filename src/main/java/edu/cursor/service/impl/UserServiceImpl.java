package edu.cursor.service.impl;

import edu.cursor.domain.model.User;
import edu.cursor.domain.repository.UserRepository;
import edu.cursor.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<User> findAll() {
        return userRepository.getAllUsers();
//        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void updateUserById(Long id, User user) {
        User dbUser = userRepository.findById(id).orElseThrow(RuntimeException::new);
        dbUser.setName(user.getName());
        dbUser.setAddress(user.getAddress());
        dbUser.setEmail(user.getEmail());
        dbUser.setName(user.getName());
        userRepository.save(dbUser);
    }

    @Override
    public void removeUserById(Long id) {
        userRepository.deleteById(id);
    }

}
