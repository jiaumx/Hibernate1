package com.mqc.servlet;

import java.io.IOException;

/**
 * @author lenovo
 * @create 2019-11-8:39
 */
public class ServletByOne extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    doPost(request,response);
    }
}
