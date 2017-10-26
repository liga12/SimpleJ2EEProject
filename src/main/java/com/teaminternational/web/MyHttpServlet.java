package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyHttpServlet extends BaseHttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        HelloWorldGenerator generator = getBean(HelloWorldGenerator.COMPONENT_NAME);
        generator.sayHello();
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<h1>" + generator.sayHello() + "</h1>");
    }
}
