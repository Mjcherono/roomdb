package com.example.roomdb.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdb.model.User;

import java.util.List;

public interface UserDao {
    //defines method that interact with db
    //eg create, delete,insert
    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);

    @Query("SELECT * FROM  user")
    List<User> getUserList();
}
