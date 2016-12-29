package com.niit.bloomyz.Service;

import com.niit.bloomyz.model.Cart;

public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
