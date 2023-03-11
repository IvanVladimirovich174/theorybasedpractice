package com.authenticationandauthorization.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private AuthenticationManager authenticationManager;
    private final String SUCCESS_LOGIN_FORM = "/admin/create";

    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @GetMapping("/login")
    public ModelAndView getLoginForm() {
        return new ModelAndView("/login_form.jsp");
    }

    @PostMapping(value = "/authorize")
    public ModelAndView authorize(HttpServletRequest httpServletRequest,
                                  HttpServletResponse httpServletResponse,
                                  @RequestParam("login") String login,
                                  @RequestParam("password") String password) throws IOException {
        HttpSession httpSession = httpServletRequest.getSession();

        if (authenticationManager.authorize(login, password)) {
            httpSession.setAttribute("authObject", "AUTHENTICATED");
            httpServletResponse.sendRedirect(SUCCESS_LOGIN_FORM);
            return null;
        } else {
            httpSession.removeAttribute("authObject");

            ModelAndView loginForm = new ModelAndView("/login_form.jsp");
            loginForm.addObject("message", "access denied !!!");

            return loginForm;
        }
    }

    @PostMapping("/logout")
    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        HttpSession session = httpServletRequest.getSession();

        session.removeAttribute("authObject");
        httpServletResponse.sendRedirect(SUCCESS_LOGIN_FORM);
    }
}