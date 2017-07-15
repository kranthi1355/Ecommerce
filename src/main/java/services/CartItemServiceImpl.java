package services;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CartItemDao;
import model.Cart;
import model.CartItem;

public class CartItemServiceImpl  implements CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem){
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem){
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId(int id){
        return cartItemDao.getCartItemByProductId(id);
    }

}
