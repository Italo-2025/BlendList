package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Tarefas;
import repository.RepositorioTarefas;

public class TelaTarefaExcluir {
    public void show() {
        Stage stage = new Stage();
        stage.setTitle("Excluir Tarefa");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        Label lblExclude = new Label("ID DA TAREFA:");
        TextField txtExclude = new TextField();


        Button btnSalvar = new Button("Salvar");

        layout.getChildren().addAll(lblExclude, txtExclude, btnSalvar);

        btnSalvar.setOnAction(e -> {

            int idTarefa = Integer.parseInt(txtExclude.getText());
            RepositorioTarefas.DeletarTarefas(1, idTarefa);

            stage.close();
        });
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();

    }
}
