package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Home {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button historyBtn;

    @FXML
    private Button addPatientBtn;

    @FXML
    private Button upcomingBtn;

    @FXML
    void initialize() {
        assert historyBtn != null : "fx:id=\"historyBtn\" was not injected: check your FXML file 'home.fxml'.";
        assert addPatientBtn != null : "fx:id=\"addPatientBtn\" was not injected: check your FXML file 'home.fxml'.";
        assert upcomingBtn != null : "fx:id=\"upcomingBtn\" was not injected: check your FXML file 'home.fxml'.";

    }
}
