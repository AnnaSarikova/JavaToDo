package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;

        primaryStage.setTitle("TO DO");

        showRegistrationOverview();

        primaryStage.show();

    }
    public void showHomeScreenOverview() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/HomeScreen.fxml"));
        BorderPane homeScreenOverview = (BorderPane) loader.load();
        Scene scene = new Scene(homeScreenOverview);
        primaryStage.setScene(scene);



    }

    public void showRegistrationOverview() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/Registration.fxml"));
        Scene registrationScene = new Scene(root);
        primaryStage.setScene(registrationScene);

    }

    public void showAuthorizationOverview() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/Authorization.fxml"));
        Scene authorizationScene = new Scene(root);
        primaryStage.setScene(authorizationScene);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
