package com.homebug.model.Stores;

import java.util.ArrayList;
import java.util.List;

/**
 * This class describe the stores and their main functionality
 *
 * @date 03.17.2016
 * @author Vitalii Nedzelskyi
 * @version 1.0
 */
public class Stores {
    private List<String> storeList = new ArrayList<>(150);

    public void addStore(String storeName){
        storeList.add(storeName);
    }

    public ArrayList<String> getStoreList() {
        return (ArrayList<String>) storeList;
    }
}
