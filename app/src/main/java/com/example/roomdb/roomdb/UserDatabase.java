package com.example.roomdb.roomdb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.roomdb.dao.UserDao;
import com.example.roomdb.model.User;

//create db in room
@Database(entities = User.class, version = 1,exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {
    private static final String dbname = "user";
    private static UserDatabase instance;
        public static synchronized UserDatabase getInstance(Context context){
            if(instance.equals(null)){
                instance = Room.databaseBuilder(context.getApplicationContext(),UserDatabase.class,dbname)
                        .fallbackToDestructiveMigration()
                        .build();
            }
            return instance;
        }

        public abstract UserDao userDao();
}
