package com.niit.bloomyz.Dao;

import java.io.IOException;

import com.niit.bloomyz.model.Cart;


public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
