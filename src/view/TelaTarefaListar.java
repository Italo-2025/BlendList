package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Tarefas;
import repository.RepositorioTarefas;

import java.util.List;

public class TelaTarefaListar {
    public void show() {
        Stage stage = new Stage();
        stage.setTitle("Lista de Tarefas");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        Label lblTitulo = new Label("ID do usuário:");
        TextField txtID = new TextField();

        Button btnBuscar = new Button("Buscar");

        ListView<String> listView = new ListView<>();

        btnBuscar.setOnAction(e -> {

            int idUsua = Integer.parseInt(txtID.getText());
            List<Tarefas> tarefas = RepositorioTarefas.listarTarefas(idUsua);

            listView.getItems().clear();
            for (Tarefas t : tarefas) {
                listView.getItems().add(t.toString());

                stage.close();
            }
        });

        layout.getChildren().addAll(lblTitulo, txtID, btnBuscar, listView);

        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();

    }

}
