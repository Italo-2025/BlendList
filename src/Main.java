import config.ConnectionDB;
import javafx.application.Application;
import model.Tarefas;
import model.Usuarios;
import repository.RepositorioTarefas;
import repository.RepositorioUsuarios;
import view.TelaPrincipal;

import java.util.List;

public class Main{
    public static void main(String[] args){
        Application.launch(TelaPrincipal.class, args);
    }
}
