package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Database.DatabaseHandler;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginUsername;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button loginBtn;

    @FXML
    void initialize() {
       loginBtn.setOnAction(actionEvent -> {
           /*
           DatabaseHandler databaseHandler = new DatabaseHandler();
           databaseHandler.signUpUser(loginUsername.getText(), loginPassword.getText());
           System.out.println(loginPassword.getText());

            */

           loginBtn.getScene().getWindow().hide();
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("/sample/view/home.fxml"));

           try {
               loader.load();
           } catch (IOException e) {
               e.printStackTrace();
           }
           Parent root = loader.getRoot();
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.showAndWait();


       });
    }
}
