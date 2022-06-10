import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainSceneController {

    @FXML
    private TextField cambiarTitulo;

    @FXML
    void clickCambiarTituloBtn(ActionEvent event) {
        Stage ventanaPrincipal = (Stage) cambiarTitulo.getScene().getWindow();
        String titulo = cambiarTitulo.getText();
        ventanaPrincipal.setTitle(titulo);
    }
}
