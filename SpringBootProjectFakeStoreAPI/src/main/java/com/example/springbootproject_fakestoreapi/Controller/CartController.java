package com.example.springbootproject_fakestoreapi.Controller;


import com.example.springbootproject_fakestoreapi.DTOs.FakeStoreCartDTO;
import com.example.springbootproject_fakestoreapi.Models.Cart;
import com.example.springbootproject_fakestoreapi.Services.FakeStoreCartService;
import com.example.springbootproject_fakestoreapi.Services.ServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class CartController {
    private FakeStoreCartService cartServices;
    //Import from services(Used to return this functions)

    //Constructor
    public CartController(FakeStoreCartService cartService) {
        this.cartServices=cartService;
    }
    @GetMapping("/Lessgoo")
    public String sayhello() {
        return "Hello World!!";
    }
    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id") Long id) {

        return cartServices.getSingleCart(id);
    }



}
