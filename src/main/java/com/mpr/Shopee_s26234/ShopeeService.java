package com.mpr.Shopee_s26234;

import org.springframework.stereotype.Component;

@Component
public class ShopeeService {

    private ShopeeStorage shopeeStorage;
    private CartStorage cartStorage;
    private CustomerStorage customerStorage;

    public ShopeeService(CartStorage cartStorage, ShopeeStorage shopeeStorage) {
        this.cartStorage = cartStorage;
        this.shopeeStorage = shopeeStorage;
    }

    public Customer customer = new Customer(1,1500);
    public Cart cart = new Cart(customer);


    cart.addItemToCar("milk");
    cart.addItemToCar("milk");
    cart.addItemToCar("beer");





}

