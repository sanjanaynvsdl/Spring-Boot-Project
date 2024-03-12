package com.example.springbootproject_fakestoreapi.Services;


import com.example.springbootproject_fakestoreapi.DTOs.FakeStoreCartDTO;
import com.example.springbootproject_fakestoreapi.Models.Cart;
import com.example.springbootproject_fakestoreapi.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreCartService implements ServiceInterface {
    private RestTemplate restemp=new RestTemplate();

    @Override
    public Cart getSingleCart(Long id) {
        FakeStoreCartDTO CartDT0=restemp.getForObject(
                "https://fakestoreapi.com/carts/" + id,
                FakeStoreCartDTO.class
        );
        Cart cart=new Cart();
        cart.setId(CartDT0.getId());
        cart.setUserId(CartDT0.getUserId());
        cart.setDate(CartDT0.getDate());
//        cart.setProducts(new Product[]);
        return cart;
//        System.out.println("successfullyyy fetchedd productt!!!");

    }
//
//    public List<Cart> getAllcart() {
//        FakeStoreCartDTO[] CartDTO2=restemp.getForObject(
//                "https://fakestoreapi.com/carts",
//                FakeStoreCartDTO[].class
//        );
//        List<Cart> cartss=new ArrayList<>();
//        for(FakeStoreCartDTO ele:CartDTO2) {
//            Cart cart=new Cart();
//            cart.setId(ele.getId());
//            cart.setUserid(ele.getUserid());
//            cart.setDate(ele.getDate());
////            Product prd=new Product();
////            prd.setProductId(ele.getProduct().getProductId());
////            prd.setQuantity(ele.getProduct().getQuantity());
////            cart.setProduct(prd);
////            cartss.add(cart);
//        }
//        System.out.print("All carts have been added to list!!");
//        return cartss;
//    }





}
