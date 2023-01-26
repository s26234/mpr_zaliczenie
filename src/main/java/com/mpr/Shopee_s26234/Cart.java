package com.mpr.Shopee_s26234;

public class Cart {
    private Customer customer;
    private  Item item;

    public Cart(Customer customer, Item item) {
        this.customer = customer;
        this.item = item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Item getItem() {
        return item;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", item=" + item +
                '}';
    }
}
