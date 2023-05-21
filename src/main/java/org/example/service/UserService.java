package org.example.service;

import org.example.hibernate.UserDao;
import org.example.models.Users;

import java.util.List;

public class UserService {

    private UserDao usersDao = new UserDao();

    public UserService() {
    }

    public Users findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(Users user) {
        usersDao.save(user);
    }

    public void deleteUser(Users user) {
        usersDao.delete(user);
    }

    public void updateUser(Users user) {
        usersDao.update(user);
    }

    public List<Users> findAllUsers() {
        return usersDao.findAll();
    }


}
