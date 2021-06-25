/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.usuarioDAO;

import com.sin.proyecto2.udep.test.beans.Profesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author developer
 */
public class ProfesorDao implements Dao<Profesor>{

    @Override
    public Optional<Profesor> get(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profesor> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String save(Profesor t) {
        try (Connection con = Conexiondb.initializeDatabase()) {
            
            String query = "INSERT INTO profesor VALUES (?,?,?,?,?);";
            
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                
                stmt.setString(1, t.getCode());
                stmt.setString(2, t.getNombre());
                stmt.setString(3, t.getApellido());
                stmt.setString(4, t.getDescripcion());
                stmt.setString(5, t.getCursoId());
                
                stmt.executeQuery();
                
                return "OK";
            }
            
        }catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String update(Profesor t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Profesor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
