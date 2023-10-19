package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class carDetails implements Initializable {

    @FXML
    private TextArea txt_price;
    @FXML
    private TextArea txt_model;
    @FXML
    private TextArea txt_capacity;
    @FXML
    private TextArea txt_description;
    @FXML
    private Button btn_rent;
    @FXML
    private TextArea txt_search;
    @FXML
    private Button btn_search;
    @FXML
    private Button btn_back;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn_back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event, "home1.fxml","Home");
            }
        });
        btn_search.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Label txt_carName = null;
                DbController.add(event, txt_carName.getText(), txt_price.getText(), txt_model.getText(), txt_capacity.getText(), txt_description.getText());
            }
        });
    }
}
