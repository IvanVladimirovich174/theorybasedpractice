package com.authenticationandauthorization.controller;

import com.authenticationandauthorization.service.ProductCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    private ProductCache productCache;

    public AdminController(ProductCache productCache) {
        this.productCache = productCache;
    }

    @GetMapping(value = "/create")
    public ModelAndView createProductView() {
        return new ModelAndView("/create_product.jsp");
    }

    @PostMapping(value = "/update")
    public ModelAndView updateProduct() {
        return new ModelAndView("/update_product.jsp");
    }
}