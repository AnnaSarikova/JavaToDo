package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button PlannedButton;

    @FXML
    private Button CategoryButton;

    @FXML
    private Button ImportantButton;

    @FXML
    private Button AboutUsButton;

    @FXML
    private Button HelpButton;

    @FXML
    private Button CreateTaskButton;

    @FXML
    void changepages(ActionEvent event) throws IOException {

    }

    @FXML
    void initialize() {
        CategoryButton.setOnAction(event -> {
            System.out.println("Вы нажали на кнопку войти");
        });

    }
}




