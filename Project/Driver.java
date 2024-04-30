package Project;

import javafx.application.Application;
//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;

//import java.util.Objects;
//import java.util.ResourceBundle;
//import java.util.Date;
//import java.util.prefs.Preferences;
//import java.text.SimpleDateFormat;
import javafx.application.Platform;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//import java.net.http.HttpResponse.BodyHandlers;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
import com.google.gson.Gson;
import javafx.stage.Stage;

//import static javafx.application.Application.launch;

public class Driver extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Load the GUI from FXML built in Scene Builder
        Parent root = FXMLLoader.load(getClass().getResource("Train.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Demo JavaFX with Scene BUilder");
        stage.setScene(scene);
        stage.show();
        
        //retrieveExerciseData();
        
     }
     
     /*private void retrieveExerciseData() {
        String muscle = "forearms";
        String apiKey = "hjlQDAYx2hi5XZF/LM6trw==RzGY8tGOf1AJskZ1";

        Gson gson = new Gson();
        //Project.Exercise ex = gson.fromJson("""
                //{

                    //"name": "Rickshaw Carry",
                    //"type": "strongman",
                    //"muscle": "forearms",
                    //"equipment": "other",
                    //"difficulty": "beginner",
                    //"instructions": "Position the frame at the starting point, and load with the appropriate weight. Standing in the center of the frame, begin by gripping the handles and driving through your heels to lift the frame. Ensure your chest and head are up and your back is straight. Immediately begin walking briskly with quick, controlled steps. Keep your chest up and head forward, and make sure you continue breathing. Bring the frame to the ground after you have reached the end point."

                //}
                 //""", Project.Exercise.class);

        // Show me this parses
        // Be sure you submit all of your supporting classes as well
        // This is all I need!
        //System.out.println("Project.Exercise Name: " + ex.getName());
        //System.out.println("Instructions: " + ex.getInstructions());
        //System.out.println("Difficulty: " + ex.getDifficulty());

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                  .uri(new URI("https://api.api-ninjas.com/v1/exercises?muscle=" + muscle))
                  .header("x-api-key", apiKey)
                  .GET()
                  .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Exercise[] exercise = gson.fromJson(response.body(), Exercise[].class);

            for (Exercise ex : exercise) {
               System.out.println("Project.Exercise Name: " + ex.getName());
               System.out.println("Instructions: " + ex.getInstructions());
               System.out.println("Difficulty: " + ex.getDifficulty());
               System.out.println();
        }

          } 
        
           catch (IOException | InterruptedException | URISyntaxException e) {
               e.printStackTrace();    
        
          }
          
        Platform.exit();
        
     }*/
     
}
