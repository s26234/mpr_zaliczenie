package com.mpr.Shopee_s26234;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ItemStorage {
    private List<Item> itemList= new ArrayList<>();

    public List<Item> getItemList(){
        return itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

}
