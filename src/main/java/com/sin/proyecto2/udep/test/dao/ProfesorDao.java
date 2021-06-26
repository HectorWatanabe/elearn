/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.dao;

import com.sin.proyecto2.udep.test.beans.Profesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author developer
 */
public class ProfesorDao implements Dao<Profesor>{

    public Optional<Profesor> getByIdCurso(long cursoId) {
        try (Connection con = Conexiondb.initializeDatabase()) {

            String query = "SELECT * FROM profesor WHERE Cursos_idCursos = ?";
            
            Optional<Profesor> optionalProfesor;

            try (PreparedStatement stmt = con.prepareStatement(query)) {

                stmt.setLong(1, cursoId);
                
                Profesor profesor;

                try (ResultSet rs = stmt.executeQuery()) {

                    if (rs.first() == false) {
                        throw new Exception("No se encontró al profesor.");
                    }
                        
                    profesor = new Profesor();
                    profesor.setCode(rs.getString("idProfesor"));
                    profesor.setNombre(rs.getString("NombreProf"));
                    profesor.setApellido(rs.getString("ApellidoProf"));
                    profesor.setDescripcion(rs.getString("Profdescrip"));
                    profesor.setCursoId(rs.getString("Cursos_idCursos"));

                }
                
                optionalProfesor = Optional.of(profesor);
                
            }

            return optionalProfesor;

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            return Optional.empty();
            
        }
    }
    
    @Override
    public Optional<Profesor> get(long id) {
        try (Connection con = Conexiondb.initializeDatabase()) {

            String query = "SELECT * FROM profesor WHERE idProfesor = ?";
            
            Optional<Profesor> optionalProfesor;

            try (PreparedStatement stmt = con.prepareStatement(query)) {

                stmt.setLong(1, id);
                
                Profesor profesor;

                try (ResultSet rs = stmt.executeQuery()) {

                    if (rs.first() == false) {
                        throw new Exception("No se encontró al profesor.");
                    }
                        
                    profesor = new Profesor();
                    profesor.setCode(rs.getString("idProfesor"));
                    profesor.setNombre(rs.getString("NombreProf"));
                    profesor.setApellido(rs.getString("ApellidoProf"));
                    profesor.setDescripcion(rs.getString("Profdescrip"));
                    profesor.setCursoId(rs.getString("Cursos_idCursos"));

                }
                
                optionalProfesor = Optional.of(profesor);
                
            }

            return optionalProfesor;

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            return Optional.empty();
            
        }
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
