/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.services;

import com.sin.proyecto2.udep.test.beans.Curso;
import com.sin.proyecto2.udep.test.beans.Profesor;

import com.sin.proyecto2.udep.test.usuarioDAO.CursoDao;
import com.sin.proyecto2.udep.test.usuarioDAO.ProfesorDao;

/**
 *
 * @author developer
 */
public class CreateCursoService {

    private final CursoDao cursoDao = new CursoDao();
    private final ProfesorDao profesorDao = new ProfesorDao();

    public String create(String[] params) {

        try {
            Curso curso = new Curso();
            curso.setCodigo(params[1]);
            curso.setNombre(params[2]);
            curso.setDuracionHoras(params[3]);
            curso.setInversion(params[4]);
            curso.setDescripcion(params[5]);

            cursoDao.save(curso);

            Profesor profesor = new Profesor();
            profesor.setCode(params[6]);
            profesor.setNombre(params[7]);
            profesor.setApellido(params[8]);
            profesor.setDescripcion(params[9]);
            profesor.setCursoId(params[1]);

            profesorDao.save(profesor);

            return "OK";
        } catch (Exception e) {
            return e.getMessage();
        }

    }

}
