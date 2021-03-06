/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.controllers;

import com.sin.proyecto2.udep.test.services.CreateCursoService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author developer
 */
@WebServlet(name = "CursoController", urlPatterns = {"/curso/nuevo"})
public class CursoController extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(!validateSessionService.validate(request.getSession(false))) {
            redirect(request, response, "/login");
            return;
        }
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/curso/nuevo.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(!validateSessionService.validate(request.getSession(false))) {
            redirect(request, response, "/login");
            return;
        }
        
        request.setCharacterEncoding("UTF-8");
        
        String []params = new String[10];
        
        params[1] = request.getParameter("curso_codigo");
        params[2] = request.getParameter("curso_nombre");
        params[3] = request.getParameter("curso_duracion");
        params[4] = request.getParameter("curso_inversion");
        params[5] = request.getParameter("curso_descripcion");
        
        params[6]  = request.getParameter("profesor_codigo");
        params[7]  = request.getParameter("profesor_nombres");
        params[8]  = request.getParameter("profesor_apellidos");
        params[9]  = request.getParameter("profesor_descripcion");
        
        CreateCursoService service = new CreateCursoService();
        String respuesta = service.create(params);
        
        if(!"OK".equals(respuesta)) {
            redirect(request, response, "/error.html");
            return;
        } 
        
        redirect(request, response, "/inicio");
    }

}
