/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.services;

import com.sin.proyecto2.udep.test.beans.Curso;
import com.sin.proyecto2.udep.test.dao.CursoDao;
import com.sin.proyecto2.udep.test.dao.ProfesorDao;

/**
 *
 * @author developer
 */
public class GetDetailCursoService {
    
    private final CursoDao cursoDao = new CursoDao();
    private final ProfesorDao profesorDao = new ProfesorDao();
    
    public Curso get(long cursoId) {
        Curso curso = cursoDao.get(cursoId).get();
        curso.setProfesor(profesorDao.getByIdCurso(cursoId).get());
        return curso;
    }
    
}
