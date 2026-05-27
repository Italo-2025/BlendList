package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaPrincipal extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Stage stage1 = new Stage();
        stage1.setTitle("BLEND LIST");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        Label titulo = new Label("Minhas Tarefas");
        Button btnCadastrar = new Button("Cadastrar Tarefa");
        Button btnListar = new Button("Listar Tarefas");
        Button btnExcluir = new Button("Excluir Tarefa");

        layout.getChildren().addAll(titulo, btnCadastrar, btnListar, btnExcluir);

        btnCadastrar.setOnAction(e -> {
           new TelaTarefaCadastro().show();
        });

        btnListar.setOnAction(e -> {
            new TelaTarefaListar().show();
        });

        btnExcluir.setOnAction(e -> {
            new TelaTarefaExcluir().show();
        });


        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    static void main(String[] args) {
        launch(args);
    }
}
