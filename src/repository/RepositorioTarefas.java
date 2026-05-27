package repository;

import model.Tarefas;
import model.Usuarios;
import config.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioTarefas {
    public static void CadastrarTarefas(Tarefas tarefas){
        String sql = "INSERT INTO tarefa (titulo, status, id_usuarios) VALUES (?, ?, ?)";

        try {
            Connection conexao = ConnectionDB.conectar();
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setString(1, tarefas.getTitulo());
            statement.setString(2, tarefas.getStatus());
            statement.setInt(3, tarefas.getId_usuario());

            statement.executeUpdate();
            System.out.println("Tarefa cadastrada com sucesso!");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static List<Tarefas> listarTarefas(int id_usuario) {
        List<Tarefas> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefa WHERE id_usuarios = ?";

        try{
            Connection conexao = ConnectionDB.conectar();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id_usuario);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Tarefas tarefa = new Tarefas(
                        rs.getString("titulo"),
                        rs.getString("status"),
                        rs.getInt("id_usuarios")
                );
                lista.add(tarefa);
                }
            }
        catch (SQLException e){
            System.out.println("Erro:"+e.getMessage());
        }
        return lista;
    }

    public static void DeletarTarefas(int id_usuario,int id_tarefa) {
        String sql = "DELETE FROM tarefa WHERE id_usuarios = ? AND id = ?";

        try{
            Connection conexao = ConnectionDB.conectar();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id_usuario);
            statement.setInt(2, id_tarefa);


            statement.executeUpdate();
            System.out.println("Tarefa excluida com sucesso!");

            }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void AtualizarTarefas(String status, int id_usuario, int id_tarefa) {
        String sql = "UPDATE tarefa set status = ? WHERE id_usuarios = ? AND id = ?";

        try{
            Connection conexao = ConnectionDB.conectar();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, status);
            statement.setInt(2, id_usuario);
            statement.setInt(3, id_tarefa);


            statement.executeUpdate();
            System.out.println("Tarefa atualizada com sucesso!");

    }catch (SQLException e){
        System.out.println(e.getMessage());}
    }
}
