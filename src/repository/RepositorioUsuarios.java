package repository;

import model.Usuarios;
import config.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class RepositorioUsuarios {
    public static void CadatroUsusarios(Usuarios usuarios) {
        String sql = "INSERT INTO usuarios (nome, senha) VALUES (?, ?)";

        try{
            Connection conexao = ConnectionDB.conectar();
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setString(1, usuarios.getNome());
            statement.setString(2, usuarios.getSenha());

            statement.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }
}
