package edu.cursor.web.controller;

import edu.cursor.domain.model.User;
import edu.cursor.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/")
    public ResponseEntity createUser(User user) {
        User newUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/")
    public ResponseEntity findAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody User user) {
        userService.updateUserById(id, user);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("User " + user.toString() + " was updated successfully");
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        userService.removeUserById(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body("User by id" + id + "was deleted successfully");
    }

}
