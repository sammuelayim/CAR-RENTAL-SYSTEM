package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Dashboard implements Initializable {


    @FXML
    public Button btn_home1;
    @FXML
    public Button btn_back;
    @FXML
    private Button btn_addC;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



         btn_addC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DbController.changeScene(event,"addCars.fxml", "Add Cars");
            }
        });
        btn_home1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            DbController.changeScene(event,"home1.fxml", "Add Cars");
        }
    });
    }
}


