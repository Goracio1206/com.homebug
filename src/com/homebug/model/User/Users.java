package com.homebug.model.User;

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

        File newUser = new File("E:\\HomeBug\\Users\\" + fName + ".txt" );
        FileWriter fw = new FileWriter(newUser);
        BufferedWriter writer = new BufferedWriter(fw);
        try {
            if (!newUser.exists()){
                newUser.createNewFile();
            } else {
                writer.write("First Name: " + fName + "\n\r\n\r");
                writer.write("Last Name: " + lName + "\n\r\n\r");
                writer.write("Address Name: " + address + "\n\r\n\r");
                writer.write("Password: " + password + "\n\r\n\r");
                writer.write("Admin: " + admin + "\n\r\n\r");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.flush();
            writer.close();
        }
    }

    protected void makeAdmin() {
        this.admin = true;
    }

}
