package com.example.spingbootdemo.service;

import com.example.spingbootdemo.model.User;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);
}
