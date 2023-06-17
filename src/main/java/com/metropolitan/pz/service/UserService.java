package com.metropolitan.pz.service;

import com.metropolitan.pz.entities.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public User getUserById(Long id);

    public User createUser(User user);

    public User updateUser(Long id, User updatedUser);

    public void deleteUser(Long id);
}
