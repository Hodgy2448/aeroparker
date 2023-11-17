package com.aeroparker.aeroparkerapp.service.impl;

import com.aeroparker.aeroparkerapp.model.User;
import com.aeroparker.aeroparkerapp.repository.UserRepository;
import com.aeroparker.aeroparkerapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override // Create user
    public User create(User user) {
        return userRepository.save(user);
    }
    @Override // Cast to receive all users
    public List<User> getAll(){ return (List<User>) userRepository.findAll(); }

    @Override // Cast to receive single users //Optional for Null handling
    public Optional<User> getSingle(Integer id){ return userRepository.findById(id); }

    @Override // Saving user
    public void addUser(User user){ userRepository.save(user); }

    @Override
    public Boolean checkEmail(String email_address){return userRepository.checkEmail(email_address);};
}
