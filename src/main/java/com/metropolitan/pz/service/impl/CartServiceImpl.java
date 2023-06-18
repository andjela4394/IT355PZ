package com.metropolitan.pz.service.impl;

import com.metropolitan.pz.entities.Cart;
import com.metropolitan.pz.repository.CartRepository;
import com.metropolitan.pz.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }


    public List<Cart> getCartItemsByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    public Optional<Cart> getCartItemById(Long cartId) {
        return cartRepository.findById(cartId);
    }

    public Cart updateCartItem(Long cartId, Cart updatedCart) {
        Optional<Cart> existingCart = cartRepository.findById(cartId);
        if (existingCart.isPresent()) {
            Cart cart = existingCart.get();
            cart.setQuantity(updatedCart.getQuantity());
            return cartRepository.save(cart);
        }
        return null; // or throw an exception if desired
    }

    public void deleteCartItem(Long cartId) {
        cartRepository.deleteById(cartId);
    }
}

