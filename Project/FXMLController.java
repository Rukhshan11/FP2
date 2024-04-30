package Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.awt.*;
import java.util.ResourceBundle;
import java.util.Date;
import java.util.prefs.Preferences;
import java.text.SimpleDateFormat;
import javafx.application.Platform;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class FXMLController {

    @FXML
    private Button Learn;
    
    @FXML
    private Button Train;

    @FXML
    private TextArea ApiContent;
    
    //public void displayApiContent(String apiContent) {
    //  ApiContent.setText(apiContent);

   // @FXML
   // private ImageView LearnPage;

   // @FXML
   // private ImageView TrainPage;
   public void go_to_driver() throws Exception {
        //Load the GUI from FXML built in Scene Builder
        Stage stage = (Stage) Learn.getScene().getWindow;
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Driver.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Demo JavaFX with Scene BUilder");
        primaryStage.setScene(scene);
        primaryStage.show();

   }
}
