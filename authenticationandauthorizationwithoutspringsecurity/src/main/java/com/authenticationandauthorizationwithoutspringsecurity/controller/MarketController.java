package com.authenticationandauthorizationwithoutspringsecurity.controller;

import com.authenticationandauthorizationwithoutspringsecurity.service.ProductCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/market")
public class MarketController {
    private ProductCache productCache;

    @Autowired
    public void setProductCache(ProductCache productCache) {
        this.productCache = productCache;
    }

    @GetMapping
    public ModelAndView getAllGoods() {
        ModelAndView modelAndView = new ModelAndView("/all_goods.jsp");

        modelAndView.addObject("productList", productCache.getAll());

        return modelAndView;
    }
}