package com.authenticationandauthorization.controller;

import com.authenticationandauthorization.service.Product;
import com.authenticationandauthorization.service.ProductCache;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
        if (!isAuthenticated(httpServletRequest)) {
           httpServletResponse.sendRedirect("/auth/login");
           return null;
        }
        return new ModelAndView("/create_product.jsp");
    }

    @PostMapping(value = "/update")
    public ModelAndView updateProduct(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse,
                                      @RequestParam(value = "id") String id,
                                      @RequestParam(value = "name") String name,
                                      @RequestParam(value = "price") String price) throws IOException {
        if (!isAuthenticated(httpServletRequest)) {
            httpServletResponse.sendRedirect("/auth/login");
            return null;
        }

        Product info = new Product(id, name, Double.parseDouble(price));

        productCache.update(info);

        return new ModelAndView("/success_create_product.jsp");
    }

    private boolean isAuthenticated(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        String authObject = (String) httpSession.getAttribute("authObject");

        if (!"AUTHENTICATED".equals(authObject)) {
            return false;
        }
        return true;
    }
}