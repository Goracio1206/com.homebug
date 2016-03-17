package com.homebug.model.Operation;

import com.homebug.model.User.Users;


/**
 * Created by vitalii.nedzelskyi on 17.03.2016.
 */
public class Operation {
    private String userName;
    private int price;
    private String store;

    public Operation (Users user, int price, String store) {
        this.userName = user.getfName();
        this.price = price;
        this.store = store;
    }
}
