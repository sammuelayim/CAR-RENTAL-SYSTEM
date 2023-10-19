package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class DbController {

    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username){
        Parent root = null;

        if (username != null){
            try {
                FXMLLoader loader = new FXMLLoader(DbController.class.getResource(fxmlFile));
                root = loader.load();
                Login login = loader.getController();
                login.setUserInformation(username);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void changeScene(ActionEvent event, String fxmlFile, String title){
        Parent root = null;

        try {
            root = FXMLLoader.load(DbController.class.getResource(fxmlFile));
        } catch (IOException e){
            e.printStackTrace();
        }

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene( new Scene ( root, 760, 520));
        stage.show();
    }

    public static void registerUser(ActionEvent event, String first_name, String last_name, String phoneno,String gender, String username, String password ){
        Connection connect = null;
        PreparedStatement insert = null;
        PreparedStatement checkUser = null;
        ResultSet resultSet = null;

        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/fruit_db", "root","");

            checkUser = connect.prepareStatement("SELECT * FROM register WHERE  username = ?");
            checkUser.setString(1,username);
            resultSet = checkUser.executeQuery();

            if (resultSet.isBeforeFirst()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("user already exists");
                alert.show();

            } else {
                String sql = " insert into register (first_name,last_name,phoneno,gender,username,password) values(" +
                        "?,?,?,?,?,?)";
                insert = connect.prepareStatement(sql);
                insert.setString(1,first_name);
                insert.setString(2, last_name);
                insert.setString(3, gender);
                insert.setString(4,phoneno);
                insert.setString(5, username);
                insert.setString(6,password);

                int row = insert.executeUpdate();
                if(row > 0){
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setContentText("new user added");
                    alert.show();
                }
            }


        }catch (SQLException e){
            e.printStackTrace();
        }

    }




    public static void logInUser(ActionEvent event, String username,String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fruit_db", "root", "");
            preparedStatement = connection.prepareStatement("SELECT password FROM register WHERE username = ?");
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();

            if (!resultSet.isBeforeFirst()) {
                System.out.println("user not found");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("provided credentials are incorrect!");
                alert.show();
            } else {
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setContentText("Login Successful!");
                        alert.show();

                        DbController.changeScene(event,"dashboard.fxml","dashboard");

                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getString("password");

                    if (retrievedPassword.equals(password)) {
                           changeScene(event, "dashboard.fxml", "DASHBOARD");
                    }else {
                        alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setContentText("Login Successful!");
                        alert.show();
                    }
                }
                changeScene(event, "dashboard.fxml", "Dashboard");
                changeScene(event, "Home.fxml", "Welcome");

            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void add(ActionEvent event, String carName, String price, String model,String capacity, String description) {
        Connection connection = null;
        PreparedStatement insert = null;
        PreparedStatement checkUser = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fruit_db", "root", "");

            checkUser = connection.prepareStatement("SELECT * FROM add_name WHERE  car_name = ?");
            checkUser.setString(1, carName);
            resultSet = checkUser.executeQuery();

            if (resultSet.isBeforeFirst()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("car already exists");
                alert.show();

            } else {
                String sql = " insert into register (carName, price, model, capacity, description ) values(" +
                        "?,?,?,?,?,)";
                insert = connection.prepareStatement(sql);
                insert.setString(1, carName);
                insert.setString(2, price);
                insert.setString(3, model);
                insert.setString(4, capacity);
                insert.setString(5, description);


                int row = insert.executeUpdate();
                if (row > 1) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setContentText("new car added");
                    alert.show();
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    }