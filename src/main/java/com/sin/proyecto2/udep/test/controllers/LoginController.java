/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.controllers;

import com.sin.proyecto2.udep.test.services.LoginService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String correo = request.getParameter("Correousuario");
        String clave = request.getParameter("Claveusuario");

        LoginService service = new LoginService();

        String respuesta = service.login(correo, clave, request.getSession());

        if (!"OK".equals(respuesta)) {
            response.sendRedirect(request.getContextPath() + "/error.html");
        } else {
            response.sendRedirect("/inicio");
        }

    }

}
