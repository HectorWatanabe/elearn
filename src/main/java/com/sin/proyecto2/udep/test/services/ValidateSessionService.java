/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.services;

import javax.servlet.http.HttpSession;

/**
 *
 * @author developer
 */
public class ValidateSessionService {
    
    public boolean validate(HttpSession session) {
        return session.getAttribute("user") != null;
    }
    
}
