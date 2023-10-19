package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Register implements Initializable {
    @FXML
    private TextField txt_firstname;
    @FXML
    private TextField txt_lastname;
    @FXML
    private RadioButton rb_male;
    @FXML
    private  RadioButton rb_female;
    @FXML
    private TextField txt_phone;
    @FXML
    private TextField txt_username;
    @FXML
    private PasswordField txt_password;
    @FXML
    private Button btn_register;
    @FXML
    private Button btn_login;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup toggleGroup = new ToggleGroup();
        rb_male.setToggleGroup(toggleGroup);
        rb_female.setToggleGroup(toggleGroup);
        rb_male.setSelected(true);


           btn_register.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String toggleName = ((RadioButton) toggleGroup.getSelectedToggle()).getText();

                DbController.registerUser(event, txt_firstname.getText(),txt_lastname.getText(),txt_phone.getText()
                ,toggleName,txt_username.getText(),txt_password.getText());


            }
        });

        btn_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event, "login.fxml", "Log in");
            }
        });

    }
}
