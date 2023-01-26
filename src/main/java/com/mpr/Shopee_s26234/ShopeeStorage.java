package com.mpr.Shopee_s26234;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopeeStorage {
    private Item milk = new Item("milk",5);
    private Item beer = new Item("beer", 7);

    public List<Item> itemList = new ArrayList<>();


    public List<Item> getItemList() {
        return itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void ItemStorage() {
        itemList.add(milk);
        itemList.add(milk);
        itemList.add(beer);
    }

    public Customer getCustomerById(int id){
        for(Customer customer : customerList) {
            if(customer.getId() == id){
                return customer;
            }
        }
        System.out.println("Nie ma takiego klienta o takim id!");
        return null;
    }


}
