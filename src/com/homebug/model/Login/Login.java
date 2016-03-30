package com.homebug.model.Login;


import java.io.File;

public class Login {


    /**
     * Check if the User is present in the system
     * @param user User Name which should be checked
     * @return true if user is present in the system and false if not present
     */
    public boolean isUserExist(String user){
        File[] users = new File("E:\\HomeBug\\Users").listFiles();
        for (File user1 : users) {
            if (user1.getName().equals(user + ".txt")) {
                return true;
            }
        }
        return false;
}
}
