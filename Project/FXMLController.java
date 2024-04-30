package Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.awt.*;
import java.util.ResourceBundle;
import java.util.Date;
import java.util.prefs.Preferences;
import java.text.SimpleDateFormat;
import javafx.application.Platform;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private Stage stage;

    @FXML
    private Label exerciseName;
    @FXML
    private AnchorPane exerciseCheckBox;

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
   public void go_to_Learn(ActionEvent event) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("Learn.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
       
   }

    public void go_to_Train(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Train.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
   /* public void initialize() {
        // Simulating data retrieval from Sample class
        Exercise sample = new Exercise();
        String name = sample.getName();
        exerciseName.setText(Exercise.);
        // Set the data to the ListView
    }*/
}
