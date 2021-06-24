/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.usuarioDAO;

import com.sin.proyecto2.udep.test.beans.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class usuarioDAO {
    public int buscarusuario(String correo, String clave, Usuario u1 ) throws ClassNotFoundException, SQLException{
        try (Connection con = Conexiondb.initializeDatabase()) {
            Statement stmt =con.createStatement();
            String consulta = "SELECT * FROM usuario WHERE Correousuario = '" + correo + "' AND Claveusuario = '" + clave + "'";
            ResultSet rs= stmt.executeQuery(consulta);

            if (!rs.next()) {
                return 0;
            } else{
                u1.setApellidousuario(rs.getString("Apellidousuario"));
                u1.setNombreusuario(rs.getString("Nombreusuario"));
                u1.setCorreousuario(rs.getString("Correousuario"));
                u1.setClaveusuario(rs.getString("Claveusuario"));
                con.close();                
                return 1; 
            }
            
        } catch(SQLException error) {
          return 404;
        }
    }
}
