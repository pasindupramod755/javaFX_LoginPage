package contraller;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginContrall {
    public TextField txtUser;
    public PasswordField txtPassword;

    public void btnLoginAction(ActionEvent e) {
        System.out.println("User name "+txtUser.getText());
        System.out.println("Password "+txtPassword.getText());
    }
}
