package com.aeroparker.aeroparkerapp.service;

import com.aeroparker.aeroparkerapp.model.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    //Create
    public User create(User user);

    // Cast to receive all users
    public List<User> getAll();

    public Optional<User> getSingle(Integer id);

    public void addUser(User user);

    public Boolean checkEmail(String email_address);
}
