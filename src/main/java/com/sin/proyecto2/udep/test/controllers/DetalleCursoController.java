/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.controllers;

import com.sin.proyecto2.udep.test.services.GetDetailCursoService;
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
@WebServlet(name = "DetalleCursoController", urlPatterns = {"/curso/detalle"})
public class DetalleCursoController extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(!validateSessionService.validate(request.getSession(false))) {
            response.sendRedirect(request.getContextPath() + "/index.html");
            return;
        }
        
        String codigo = (String) request.getParameter("codigo");
        
        long codigoCurso = Long.parseLong(codigo);
        
        GetDetailCursoService service = new GetDetailCursoService();
        
        request.setAttribute("curso", service.get(codigoCurso));
        
        request.getRequestDispatcher("detail.jsp").forward(request, response);
        
    }

}
