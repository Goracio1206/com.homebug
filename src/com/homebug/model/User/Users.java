package com.homebug.model.User;

import com.homebug.model.DB.WriteToDB;

import java.io.*;

/**
 * This class is for describe all kind of users and their main
 * functionality
 *
 * @date 03.17.2016
 * @author Vitalii Nedzelskyi
 * @version 1.0
 */

public class Users {
    private String fName;
    private String lName;
    private String address;
    private long phone;
    private String password;
    private boolean admin;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Users(String fName, String lName, String address, long phone, String password, boolean admin) throws IOException {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.admin = admin;

        WriteToDB.writeToDB(fName,lName,address,phone,password,admin,this);
    }

    protected void makeAdmin() {
        this.admin = true;
    }

}
