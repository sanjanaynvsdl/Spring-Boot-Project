package com.example.springbootproject_fakestoreapi.DTOs;

import com.example.springbootproject_fakestoreapi.Models.Product;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class FakeStoreCartDTO {
    private Long id;
    private Long userId;
    private Date date;
    private Product[] products;
}
