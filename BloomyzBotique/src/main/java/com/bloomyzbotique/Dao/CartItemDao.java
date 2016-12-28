package com.bloomyzbotique.Dao;

import com.bloomyzbotique.model.Cart;


public interface CartItemDao {

    void addCartItem(Cart cartItem);

    void removeCartItem(Cart cartItem);

    void removeAllCartItems(Cart cart);

    Cart getCartItemByProductId (int productId);

}
