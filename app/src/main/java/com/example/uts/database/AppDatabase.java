package com.example.uts.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.uts.dao.UserDao;
import com.example.uts.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
