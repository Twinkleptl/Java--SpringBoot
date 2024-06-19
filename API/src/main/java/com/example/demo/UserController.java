package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepo userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserModel request) {
        if (userRepository.findByUsername(request.getUsername()) != null) {
            return new ResponseEntity<>("User already exists", HttpStatus.CONFLICT);
        }

        UserModel user = new UserModel();
        user.setEmail(request.getEmail());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        // In a real-world application, you'd hash the password before saving
        userRepository.save(user);

        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }

    @GetMapping("/fetch")
    public ResponseEntity<?> fetchUser(@RequestParam(name = "username") String username) {
        UserModel user = userRepository.findByUsername(username);
        if (user == null) {
        	return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
