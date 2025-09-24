package contraller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;

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
}
