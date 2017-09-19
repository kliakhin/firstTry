package com.test.bu.controller;

import com.test.bu.config.SpringConfig;
import com.test.bu.entity.User;
import com.test.bu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        this.userService = context.getBean(UserService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        User byId = userService.getById(Integer.parseInt(id));
        writer.print("<h1>I'm code from servlet</h1>");
        writer.print("<h1>User = " + byId.toString() + " </h1>");
    }
}
