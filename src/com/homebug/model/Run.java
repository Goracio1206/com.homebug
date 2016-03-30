package com.homebug.model;

import com.homebug.model.Login.Login;
import com.homebug.model.User.Users;

import java.io.IOException;

/**
 * This class just to test features
 */
public class Run {
    public static void main(String[] args) throws IOException {
        Users user = new Users("Vitalii", "C", "asdfadsf", 456965L, "password", true);
        Login log = new Login();
        if (log.isUserExist("Vitalii")) {
            System.out.println("ture");
        }else {
            System.out.println("false");
        }
    }
}
