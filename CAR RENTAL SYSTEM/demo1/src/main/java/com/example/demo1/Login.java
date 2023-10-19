package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {

    @FXML
    private Button btn_login;

    @FXML
    private PasswordField pf_password;

    @FXML
    private TextField txt_username;
    @FXML
    private Button btn_register;
//    @FXML
//    private ImageView imgAuto;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.logInUser(event, txt_username.getText(),pf_password.getText());
            }
        });


        btn_register.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event, "register.fxml", "Register");
            }
        });

    }

    public void setUserInformation(String username) {
    }
}