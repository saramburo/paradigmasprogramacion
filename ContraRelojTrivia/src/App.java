import java.io.IOException;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

//import org.w3c.dom.events.MouseEvent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class App extends Application {
    private Scene escena;

    @Override
 /* 
 public void start(Stage vetana) {
        
        inicializarComponentes();
        gestionEventos();
        vetana.setTitle("Hello World!");
        vetana.setScene(escena);
        vetana.show();
        
    }
    */
  public void start(Stage stage) throws IOException {
   try {

            Parent root = FXMLLoader.load(this.getClass().getResource("main.fxml"));
            Scene scene = new Scene(root);

            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    public void inicializarComponentes() {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
            escena = new Scene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gestionEventos() {
        escena.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent evento) {
                System.out.println("Se presionó el botón: " + evento.getButton());
            }
        });
    }
 
 public static void main(String[] args) {
        launch(args);
    }
}
