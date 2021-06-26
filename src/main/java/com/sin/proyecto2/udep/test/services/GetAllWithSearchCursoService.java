/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.services;

import com.sin.proyecto2.udep.test.beans.Curso;
import com.sin.proyecto2.udep.test.dao.CursoDao;
import java.util.List;

/**
 *
 * @author developer
 */
public class GetAllWithSearchCursoService {
    
    private final CursoDao cursoDao = new CursoDao();
    
    public List<Curso> get(String codigo) {
        return cursoDao.getAllWithSearch(codigo);
    }
    
}
