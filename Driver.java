import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.util.Objects;
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
import com.google.gson.Gson;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Driver extends Application {


    public static void main(String[] args) { {
        launch(args);
    }

        String data = """
              
                {
                     
                    "name": "Rickshaw Carry",
                    "type": "strongman",
                    "muscle": "forearms",
                    "equipment": "other",
                    "difficulty": "beginner",
                    "instructions": "Position the frame at the starting point, and load with the appropriate weight. Standing in the center of the frame, begin by gripping the handles and driving through your heels to lift the frame. Ensure your chest and head are up and your back is straight. Immediately begin walking briskly with quick, controlled steps. Keep your chest up and head forward, and make sure you continue breathing. Bring the frame to the ground after you have reached the end point."
                  
                }
                 """;

        // Show me this parses
        // Be sure you submit all of your supporting classes as well
        // This is all I need!
        Gson gson = new Gson();
        Exercise e = gson.fromJson(data, Exercise.class);
        System.out.println(e.getName());
        System.out.println(e.getInstructions());
        System.out.println(e.getDifficulty());







    }

    @Override
    public void start(Stage stage) throws Exception
    {
        // Load the GUI from FXML built in Scene Builder
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DemoView.fxml")));
        Scene scene = new Scene(root);
        stage.setTitle("Demo JavaFX with Scene BUilder");
        stage.setScene(scene);
        stage.show();

        // All of the code that interacts with the API and the Scene
        //   is found in DemoViewController.java

    }
}
