/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.controllers;

import com.sin.proyecto2.udep.test.services.ValidateSessionService;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author developer
 */

public class BaseController extends HttpServlet {

    protected final ValidateSessionService validateSessionService = new ValidateSessionService();
    
}
