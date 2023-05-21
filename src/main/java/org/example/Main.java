package org.example;

import org.example.models.Users;
import org.example.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Users user = new Users("26",2);
        userService.saveUser(user);

        System.out.println(userService.findAllUsers());

    }
}