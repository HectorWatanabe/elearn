/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.services;

import com.sin.proyecto2.udep.test.beans.Usuario;
import com.sin.proyecto2.udep.test.usuarioDAO.usuarioDAO;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class usuarioservices {
    private usuarioDAO usuarioDAO = new usuarioDAO();
    public int buscarusuario(String correo, String clave, Usuario usuario) throws ClassNotFoundException, SQLException{    
        return usuarioDAO.buscarusuario(correo, clave, usuario);
    }    
}
