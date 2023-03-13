package com.springsecurity.controller;

import com.springsecurity.service.Product;
import com.springsecurity.service.ProductCache;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    private ProductCache productCache;

    @Autowired
    public void setProductCache(ProductCache productCache) {
        this.productCache = productCache;
    }

    @GetMapping(value = "/create")
    public ModelAndView createProductView(HttpServletRequest httpServletRequest,
                                          HttpServletResponse httpServletResponse) throws IOException {
        return new ModelAndView("/create_product.jsp");
    }

    @PostMapping(value = "/update")
    public ModelAndView updateProduct(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse,
                                      @RequestParam(value = "id") String id,
                                      @RequestParam(value = "name") String name,
                                      @RequestParam(value = "price") String price) throws IOException {

        Product info = new Product(id, name, Double.parseDouble(price));

        productCache.update(info);

        return new ModelAndView("/success_create_product.jsp");
    }
}