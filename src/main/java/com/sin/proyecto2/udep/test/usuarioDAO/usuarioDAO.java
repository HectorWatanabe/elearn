/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.usuarioDAO;

import com.sin.proyecto2.udep.test.beans.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HP
 */
public class UsuarioDao implements Dao<Usuario> {

    public Usuario ingresar(String username, String password) {

        try (Connection con = Conexiondb.initializeDatabase()) {

            String query = "SELECT * FROM usuario WHERE Correousuario = ? AND Claveusuario = ?";

            Usuario usuario;

            try (PreparedStatement stmt = con.prepareStatement(query)) {

                stmt.setString(1, username);
                stmt.setString(2, password);

                try (ResultSet rs = stmt.executeQuery()) {

                    if (rs.first() == false) {
                        throw new Exception("No se encontró el usuario.");
                    }

                    usuario = new Usuario();
                    usuario.setApellidousuario(rs.getString("Apellidousuario"));
                    usuario.setNombreusuario(rs.getString("Nombreusuario"));
                    usuario.setCorreousuario(rs.getString("Correousuario"));
                    usuario.setClaveusuario(rs.getString("Claveusuario"));
                }
            }

            return usuario;

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            return null;
            
        }
        
    }

    @Override
    public Optional<Usuario> get(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String save(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Usuario t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
