package Project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class LearnPageController {

    @FXML
    private TextArea ApiContent;
    
    public void displayApiContent(String apiContent) {
      ApiContent.setText(apiContent);

   // @FXML
   // private ImageView LearnPage;

   // @FXML
   // private ImageView TrainPage;

   }
}
