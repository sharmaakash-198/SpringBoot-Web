package com.springbootWeb.WebApp.service;

import com.springbootWeb.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Iphone", 50000),
            new Product(102,"CMF Phone 2 PRO", 25000),
            new Product(103,"Samsung ZFold", 70000));

    public List<Product> getProducts(){
        return products;
    }
}

