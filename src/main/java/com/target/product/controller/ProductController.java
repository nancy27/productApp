package com.target.product.controller;

import com.target.product.domain.ProductDesc;
import com.target.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  @Autowired
    ProductService productService;

    @RequestMapping("/product/{productId}")
    public ProductDesc getProductDetails(@PathVariable Integer productId) throws Exception {
     return productService.getProductDetails(productId);
    }

    }
