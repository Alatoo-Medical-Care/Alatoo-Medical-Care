package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Database.DatabaseHandler;
import sample.LoginUser;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label caution;

    @FXML
    private TextField loginUsername;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button loginBtn;

    private DatabaseHandler databaseHandler;

    @FXML
    void initialize() {
        databaseHandler = new DatabaseHandler();

        loginBtn.setOnAction(actionEvent -> {
            String username = loginUsername.getText().trim();
            String password = loginPassword.getText().trim();
            LoginUser loginUser = new LoginUser();
            loginUser.setUsername(username);
            loginUser.setPassword(password);

            ResultSet resRow = databaseHandler.getUser(loginUser);
            int count = 0;
            try {
                while (resRow.next()) {
                    count++;
                }
                if(count==1){
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
                }else{
                    caution.setText("Wrong username or password!");
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        });
    }
}
