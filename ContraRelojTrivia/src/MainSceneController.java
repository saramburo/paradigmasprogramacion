
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button bt_inicio;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void onInicioButtonClick(ActionEvent event) throws IOException {
     root=FXMLLoader.load(this.getClass().getResource("Temas.fxml"));
     stage=(Stage)((Node)event.getSource()).getScene().getWindow();
     scene=new Scene(root);
     stage.setScene(scene);
     stage.show();
    }
    @FXML
    protected void onGeografiaClick(ActionEvent event) throws IOException {
        root=FXMLLoader.load(this.getClass().getResource("Preguntas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onEntretenimientoClick(ActionEvent event) throws IOException {
        root=FXMLLoader.load(this.getClass().getResource("Preguntas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onHistoriaClick(ActionEvent event) throws IOException {
        root=FXMLLoader.load(this.getClass().getResource("Preguntas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onArteClick(ActionEvent event) throws IOException {
        root=FXMLLoader.load(this.getClass().getResource("Preguntas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onCienciaClick(ActionEvent event) throws IOException {
        root=FXMLLoader.load(this.getClass().getResource("Preguntas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onDeportesClick(ActionEvent event) throws IOException {
        root=FXMLLoader.load(this.getClass().getResource("Preguntas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onCulturaClick(ActionEvent event) throws IOException {
        root=FXMLLoader.load(this.getClass().getResource("Preguntas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onvolverTemas(ActionEvent event) throws IOException {
        root=FXMLLoader.load(this.getClass().getResource("Temas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



