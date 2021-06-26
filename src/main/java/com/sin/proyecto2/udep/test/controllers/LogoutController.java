/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.controllers;

import com.sin.proyecto2.udep.test.services.LogoutService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author developer
 */
@WebServlet(name = "LogoutController", urlPatterns = {"/logout"})
public class LogoutController extends BaseController {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(!validateSessionService.validate(request.getSession(false))) {
            response.sendRedirect(request.getContextPath() + "/index.html");
            return;
        }
        
        LogoutService service = new LogoutService();
        service.logout(request.getSession(false));
        response.sendRedirect(request.getContextPath() + "/index.html");
        
    }

}
