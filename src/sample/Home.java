package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Home {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView homeImg;

    @FXML
    private ImageView historyImg;

    @FXML
    private ImageView patientImg;

    @FXML
    private ImageView upcomingImg;

    @FXML
    private ImageView history;

    @FXML
    private Button historyBtn;

    @FXML
    private ImageView addPatient;

    @FXML
    private Button addPatientBtn;

    @FXML
    private ImageView upcoming;

    @FXML
    private Button upcomingBtn;

    @FXML
    void handleHistory(MouseEvent event) {
        /*
        historyImg.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/view/history.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

         */

    }

    @FXML
    void handleHome(MouseEvent event) {

    }

    @FXML
    void handlePatient(MouseEvent event) {

    }

    @FXML
    void handleUpcoming(MouseEvent event) {

    }

    @FXML
    void initialize() {
        historyImg.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            historyImg.setOpacity(0.5);
        });
    }
}

