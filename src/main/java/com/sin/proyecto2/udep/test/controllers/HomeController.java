/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.controllers;

import com.sin.proyecto2.udep.test.beans.Curso;
import com.sin.proyecto2.udep.test.services.GetAllCursoService;
import com.sin.proyecto2.udep.test.services.GetAllWithSearchCursoService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author developer
 */
@WebServlet(name = "HomeController", urlPatterns = {"/inicio"})
public class HomeController extends BaseController {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(!validateSessionService.validate(request.getSession(false))) {
            response.sendRedirect(request.getContextPath() + "/index.html");
            return;
        }
        
        List<Curso> cursos;
        
        String search = (String) request.getParameter("search");
        
        /* Si no hay un valor en Buscar */
        if(search == null) {
            GetAllCursoService getAllCursoServie = new GetAllCursoService();
            cursos = getAllCursoServie.get();
            request.setAttribute("cursos", cursos);
            request.getRequestDispatcher("bienvenido.jsp").forward(request, response);
            return;
        }
        
        /* Si Buscar existe pero está vacio */
        if(search.isEmpty()) {
            response.sendRedirect("/inicio");
            return;
        }
        
        /* Si tiene un valor en Buscar y se filtra la busqueda por codigo */
        GetAllWithSearchCursoService getAllWithSearchCursoService = new GetAllWithSearchCursoService();
       
        cursos = getAllWithSearchCursoService.get(search);
        request.setAttribute("cursos", cursos);
        request.setAttribute("search", search);  
        request.getRequestDispatcher("bienvenido.jsp").forward(request, response);
        
    }

}
