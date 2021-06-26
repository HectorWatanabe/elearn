/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.dao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author developer
 */
public interface Dao<T> {
    
    Optional<T> get(long id);
    
    List<T> getAll();
    
    String save(T t);
    
    String update(T t, String[] params);
    
    String delete(T t);
    
}
