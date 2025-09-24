package contraller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SigninContrall {
    Stage stage = new Stage();
    public void btnLoginAction(ActionEvent e) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/loginUI.fxml"))));
            stage.show();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        stage.show();
    }
}
