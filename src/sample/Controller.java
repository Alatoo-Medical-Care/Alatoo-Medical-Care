package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField loginUsername;

    @FXML
    private JFXTextField loginPassword;

    @FXML
    private JFXButton loginBtn;

    @FXML
    void initialize() {
        loginBtn.setOnAction(actionEvent ->{
            System.out.println("Login Clicked!");
        });

    }
}
