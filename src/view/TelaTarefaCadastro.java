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

public class TelaTarefaCadastro {

            public void show() {
                Stage stage = new Stage();
                stage.setTitle("Cadastrar Tarefa");

                VBox layout = new VBox(10);
                layout.setPadding(new Insets(20));

                Label lblTitulo = new Label("Título:");
                TextField txtTitulo = new TextField();

                Label lblStatus = new Label("Status:");
                ComboBox<String> cmbStatus = new ComboBox<>();
                cmbStatus.getItems().addAll("PENDENTE", "CONCLUIDA");

                Button btnSalvar = new Button("Salvar");

                layout.getChildren().addAll(lblTitulo, txtTitulo, lblStatus, cmbStatus, btnSalvar);

                btnSalvar.setOnAction(e -> {
                    String titulo = txtTitulo.getText();
                    String status = cmbStatus.getValue();

                    Tarefas tarefa = new Tarefas(titulo, status, 1);
                    RepositorioTarefas.CadastrarTarefas(tarefa);

                    stage.close();
                });
                Scene scene = new Scene(layout, 300, 200);
                stage.setScene(scene);
                stage.show();

        }
}
