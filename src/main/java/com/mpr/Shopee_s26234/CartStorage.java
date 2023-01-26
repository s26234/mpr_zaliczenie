package com.mpr.Shopee_s26234;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartStorage {
private List<Cart> cartList = new ArrayList<>();


public List<Cart> getCartList() {
    return cartList;
}
}
