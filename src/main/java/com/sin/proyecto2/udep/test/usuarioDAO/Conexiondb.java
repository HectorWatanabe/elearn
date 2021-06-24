/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sin.proyecto2.udep.test.usuarioDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class Conexiondb {
    
    protected static Connection initializeDatabase()
        throws SQLException, ClassNotFoundException
    {        
        
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/elearn?user=root&password=");
        
        return con;
    }    
 
}
