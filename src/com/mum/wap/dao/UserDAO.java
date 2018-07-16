package com.mum.wap.dao;

import com.mum.wap.service.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAO {

    Map<Integer, User> usersDb = new HashMap<>();

    {
        usersDb.put(1, new User(1, "Admin", "1234"));
        usersDb.put(2, new User(2, "user1", "123"));
        usersDb.put(3, new User(3, "user2", "123"));
    }

    public void addUser(User user){
        usersDb.put(user.getId(), user);
    }

    public void deleteUser(int userId){
        usersDb.remove(userId);
    }

    public void updateUser(User user){
        usersDb.put(user.getId(), user);
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(usersDb.values());
    }

    public User getUserById(int userId){
        return usersDb.get(userId);
    }

    public int genId() {
        return usersDb.size()+1;
    }
}
