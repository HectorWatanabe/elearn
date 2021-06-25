/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.usuarioDAO;

import com.sin.proyecto2.udep.test.beans.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author developer
 */
public class CursoDao implements Dao<Curso>{

    @Override
    public Optional<Curso> get(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Curso> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String save(Curso t) {
        try (Connection con = Conexiondb.initializeDatabase()) {
            
            String query = "INSERT INTO cursos VALUES (?,?,?,?,?);";
            
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                
                stmt.setString(1, t.getCodigo());
                stmt.setString(2, t.getNombre());
                stmt.setString(3, t.getDescripcion());
                stmt.setString(4, t.getDuracionHoras());
                stmt.setString(5, t.getInversion());
                
                stmt.executeQuery();
                
                return "OK";
            }
            
        }catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String update(Curso t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Curso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
