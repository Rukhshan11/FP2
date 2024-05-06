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
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import javafx.stage.Stage;

//import static javafx.application.Application.launch;

public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://exercises-by-api-ninjas.p.rapidapi.com/v1/exercises?muscle=biceps"))
                .header("X-RapidAPI-Key", "39279d9661msh9bfa92e43ee23ddp1b0c61jsn2a3a79b77785")
                .header("X-RapidAPI-Host", "exercises-by-api-ninjas.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();

        Gson gson = new Gson();

        Exercise[] exercisesJsonArray = gson.fromJson(responseBody, Exercise[].class);
        List<Exercise> exercises = Arrays.asList(exercisesJsonArray);
        System.out.println(exercises);


        Parent root = FXMLLoader.load(getClass().getResource("/Project/Learn.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Demo JavaFX with Scene BUilder");
        stage.setScene(scene);
        stage.show();


    }
}
