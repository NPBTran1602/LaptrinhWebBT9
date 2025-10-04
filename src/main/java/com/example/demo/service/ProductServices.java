package com.example.demo.service;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.example.demo.entity.Product;

       
public interface ProductServices {
	    void delete(Long id);
	    Product get(Long id);
	    Product save(Product product);
	    List<Product> listAll();
}
