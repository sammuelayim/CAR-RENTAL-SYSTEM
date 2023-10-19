package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddCars implements Initializable {
    @FXML
    private TextField txt_carName;
    @FXML
    private TextField txt_price;
    @FXML
    private TextField txt_model;
    @FXML
    private TextField txt_capacity;
    @FXML
    private TextField txt_description;
    @FXML
    private Button btn_add;
    @FXML
    private Button btn_back;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn_back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event, "dashboard.fxml", "Dashboard");
            }
        });

         btn_add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
             public void handle(ActionEvent event) {
                DbController.add(event, txt_carName.getText(), txt_price.getText(), txt_model.getText(), txt_capacity.getText(), txt_description.getText());
            }
        });
    }
}
