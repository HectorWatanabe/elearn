/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.dao;

import com.sin.proyecto2.udep.test.beans.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author developer
 */
public class CursoDao implements Dao<Curso>{
    
    public List<Curso> getAllWithSearch(String codigo) {
        try (Connection con = Conexiondb.initializeDatabase()) {
            
            String query = "SELECT * FROM cursos WHERE idCursos = ?;";
            
            List<Curso> cursos = new ArrayList<>();
            
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                
                stmt.setString(1, codigo);
                
                try (ResultSet rs = stmt.executeQuery()) {
                    
                    while(rs.next()) {
                        
                        Curso curso = new Curso();
                        
                        curso.setCodigo(rs.getString("idCursos"));
                        curso.setNombre(rs.getString("Curso"));
                        curso.setDescripcion(rs.getString("Descripción"));
                        curso.setDuracionHoras(rs.getString("Duraciónhoras"));
                        curso.setInversion(rs.getString("Inversión"));
                        
                        cursos.add(curso);
                        
                    }
                    
                }
                
                return cursos;
                
            }
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Optional<Curso> get(long id) {
        try (Connection con = Conexiondb.initializeDatabase()) {

            String query = "SELECT * FROM cursos WHERE idCursos = ?";
            
            Optional<Curso> optionalCurso;

            try (PreparedStatement stmt = con.prepareStatement(query)) {

                stmt.setLong(1, id);
                
                Curso curso;

                try (ResultSet rs = stmt.executeQuery()) {

                    if (rs.first() == false) {
                        throw new Exception("No se encontró el usuario.");
                    }
                        
                    curso = new Curso();
                    curso.setCodigo(rs.getString("idCursos"));
                    curso.setNombre(rs.getString("Curso"));
                    curso.setDescripcion(rs.getString("Descripción"));
                    curso.setDuracionHoras(rs.getString("Duraciónhoras"));
                    curso.setInversion(rs.getString("Inversión"));

                }
                
                optionalCurso = Optional.of(curso);
                
            }

            return optionalCurso;

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            return Optional.empty();
            
        }
    }

    @Override
    public List<Curso> getAll() {
        try (Connection con = Conexiondb.initializeDatabase()) {
            
            String query = "SELECT * FROM cursos;";
            
            List<Curso> cursos = new ArrayList<>();
            
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                
                try (ResultSet rs = stmt.executeQuery()) {
                    
                    while(rs.next()) {
                        
                        Curso curso = new Curso();
                        
                        curso.setCodigo(rs.getString("idCursos"));
                        curso.setNombre(rs.getString("Curso"));
                        curso.setDescripcion(rs.getString("Descripción"));
                        curso.setDuracionHoras(rs.getString("Duraciónhoras"));
                        curso.setInversion(rs.getString("Inversión"));
                        
                        cursos.add(curso);
                        
                    }
                    
                }
                
                return cursos;
                
            }
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
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
