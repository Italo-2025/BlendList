package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/blend_list";
    private static final String USUARIO = "root";
    private static final String SENHA = "ItaloIsis2009";

    public static Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("");
            return conexao;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
