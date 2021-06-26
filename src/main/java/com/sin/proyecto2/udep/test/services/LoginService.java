/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.services;

import com.sin.proyecto2.udep.test.beans.Usuario;
import com.sin.proyecto2.udep.test.dao.UsuarioDao;
import javax.servlet.http.HttpSession;

/**
 *
 * @author developer
 */
public class LoginService {
    
    private final UsuarioDao usuarioDAO = new UsuarioDao();
    
    public String login(String username, String password, HttpSession session) {
        
        Usuario usuario = usuarioDAO.ingresar(username, password);
        
        if(usuario == null) {
            return "Credenciales incorrectas";
        }
        
        session.setAttribute("user", usuario);
        
        return "OK";
        
    }
    
}
