/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

import java.sql.Connection; // Serve para fazer a conexão
import java.sql.DriverManager; // Biblioteca
import java.sql.SQLException; // Serve para informar erros

/**
 *
 * @author aluno
 */
public class Conexão {

    private static final String url = "Jdbc:mysql://localhost:3306/rpg";

    private static final String user = "root";
    private static final String password = "";

    private static Connection conn;

    private static Connection getConexão() throws SQLException {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
