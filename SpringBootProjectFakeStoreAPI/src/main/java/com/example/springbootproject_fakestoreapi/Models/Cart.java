package com.example.springbootproject_fakestoreapi.Models;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long userId;
    private Date date;
    private Product[] products;
}
