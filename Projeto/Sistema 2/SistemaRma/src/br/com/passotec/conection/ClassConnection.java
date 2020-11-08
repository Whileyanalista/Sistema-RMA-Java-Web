/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.passotec.conection;

import java.sql.*;

public class ClassConnection {

    //METODO DE CONECTION COM O BANCO
    public static Connection conector() {
        //VARIAVES PARA ESTABELCER CONECTION
        java.sql.Connection conexao = null;
        //CHAMANDO O DRIVER DE CONECXAO
        String driver = "com.mysql.jdbc.Driver";
        //ARMAZENANDO INFORMAÇOES DO BANCO
        String url = "jdbc:mysql://localhost:3306/sistemarma";
        String user = "root";
        String password = "1234";
        //ESTABELECENDO CONECXAO COM O BANCO
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //EXCLARECER O USUARIO SOBRE A CONEXAO
            //System.out.println(e);
            return null;
        }
    }

}
