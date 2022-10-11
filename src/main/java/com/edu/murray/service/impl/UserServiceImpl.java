package com.edu.murray.service.impl;

import com.edu.murray.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author hp
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {
        System.out.println("one user saved!");
    }

    @Override
    public String deleteUser() {
        System.out.println("user deleted!");
        return "userID: xxx";
    }

    @Override
    public String addUser() {
        System.out.println("user added!");
        return "userID:xxx";
    }

    @Override
    public String updateUser() {
        System.out.println("user updated");
        return "userID:xxx, xxx updated.";
    }
}
