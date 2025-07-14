package main.qlsinhvien;

import Controllers.LoginController;
import Views.Login;

public class LoginAndSignUp {

    public static void main(String[] args) {
        Login loginForm = new Login();
        new LoginController(loginForm);
        loginForm.setVisible(true);
        loginForm.setLocationRelativeTo(null);
    }

}
