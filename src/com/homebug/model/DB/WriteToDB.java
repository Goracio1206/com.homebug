package com.homebug.model.DB;

import com.homebug.model.User.Users;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by vitalii.nedzelskyi on 30.03.2016.
 */
public class WriteToDB {
    public static void writeToDB(String fName, String lName, String address, long phone, String password, boolean admin, Users user) throws IOException {
        File newUser = new File("E:\\HomeBug\\Users\\" + fName + ".txt" );
        FileWriter fw = new FileWriter(newUser);
        BufferedWriter writer = new BufferedWriter(fw);
        try {
            if (!newUser.exists()){
                newUser.createNewFile();
                writeToFile(fName, lName, address, phone, password, admin, writer);
            } else {
                writeToFile(fName, lName, address, phone, password, admin, writer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.flush();
            writer.close();
        }
    }

    private static void writeToFile(String fName, String lName, String address, long phone, String password, boolean admin, BufferedWriter writer){
        try {
            writer.write("First Name: " + fName + "\n\r\n\r");
            writer.write("Last Name: " + lName + "\n\r\n\r");
            writer.write("Address Name: " + address + "\n\r\n\r");
            writer.write("Phone: " + phone + "\n\r\n\r");
            writer.write("Password: " + password + "\n\r\n\r");
            writer.write("Admin: " + admin + "\n\r\n\r");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



