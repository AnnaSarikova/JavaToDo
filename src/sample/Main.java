package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;
//    private BorderPane testScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("C:\\Users\\ASUS\\Desktop\\JavaToDo\\src\\sample\\views\\Registration.fxml"));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("C:\\Users\\ASUS\\Desktop\\JavaToDo\\src\\sample\\views\\Registration.fxml"));
        AnchorPane testScene = loader.load();

        Scene scene = new Scene(testScene);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TO DO");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
