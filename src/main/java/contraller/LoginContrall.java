package contraller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class LoginContrall {
    public TextField txtUser;
    public PasswordField txtPassword;

    public void btnLoginAction(ActionEvent e) {
        System.out.println("User name "+txtUser.getText());
        System.out.println("Password "+txtPassword.getText());
        if (txtUser.getText() == ""){
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setHeaderText("Input Your UserName!");
            a1.show();
            return;
        }
        if (txtPassword.getText() == ""){
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setHeaderText("Input Your Password!");
            a1.show();
        }
    }
    Stage stage = new Stage();
    public void btnSignInAction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/signIN.fxml"))));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        stage.show();
    }
}
