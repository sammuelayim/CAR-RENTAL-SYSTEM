package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Home1 implements Initializable {

    @FXML
    private Button btn_audi;
    @FXML
    private Button btn_benz;
    @FXML
    private Button btn_hyundai;
    @FXML
    private Button btn_chevrolet;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn_audi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event, "carDetails.fxml","CarDetails");
            }
        });
        btn_benz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event, "carDetails.fxml","CarDetails");
            }
        });
        btn_hyundai.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event, "carDetails.fxml","CarDetails");
            }
        });
        btn_chevrolet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event, "carDetails.fxml","CarDetails");
            }
        });
    }



}

