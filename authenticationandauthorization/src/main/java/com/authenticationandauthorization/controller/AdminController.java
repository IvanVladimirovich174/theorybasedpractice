package com.authenticationandauthorization.controller;

import com.authenticationandauthorization.service.Product;
import com.authenticationandauthorization.service.ProductCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ModelAndView updateProduct(@RequestParam("id") String id,
                                      @RequestParam("name") String name,
                                      @RequestParam("price") String price) {
        Product info = new Product(id, name, Double.parseDouble(price));
        productCache.update(info);

        return new ModelAndView("/success_create_product.jsp");
    }
}