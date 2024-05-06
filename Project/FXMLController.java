package Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;


import java.util.List;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLController  {

    @FXML
    private Stage stage;
    @FXML
    private Label exerciseLabel;

    @FXML
    private VBox exerciseVBox;

    @FXML
    private Label nameLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private Label instructionsLabel;
    public List<Exercise> exercises;

    public void initialize() {
      for (Exercise exercise : exercises) {
         nameLabel.setText(exercise.name);
           typeLabel.setText(exercise.type);
           instructionsLabel.setText(exercise.instructions);
           VBox exerciseDetailsVBox = new VBox(nameLabel, typeLabel, instructionsLabel);
           exerciseVBox.getChildren().add(exerciseDetailsVBox);

            }

        }

        public void go_to_Learn (ActionEvent event) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("Learn.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }

       public void go_to_Train (ActionEvent event) throws Exception {
           Parent root = FXMLLoader.load(getClass().getResource("Train.fxml"));
           stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           Scene scene = new Scene(root);
           stage.setScene(scene);
           stage.show();

        }


}

    

    /* public void initialize() {
         // Simulating data retrieval from Sample class
         Exercise sample = new Exercise();
         String name = sample.getName();
         exerciseName.setText(Exercise.);
         // Set the data to the ListView
     }*/

