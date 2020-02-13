package com.example.roomdb.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

//this reps table
//declare table name
@Entity(tableName = "user")

public class User {
    //declare column names

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "firstname")
    private String firstname;

    @ColumnInfo(name = "lastname")
    private String lastname;

    @ColumnInfo(name = "phonenumber")
    private String phonenumber;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "gender")
    private String gender;

    @ColumnInfo(name = "status")
    private String status;


    //create user constructor

    public User(int id, String firstname, String lastname, String phonenumber, String email, String gender, String status) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.gender = gender;
        this.status = status;
    }

    @Ignore
    public User(String firstname, String lastname, String phonenumber, String email, String gender, String status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.gender = gender;
        this.status = status;
    }
}
