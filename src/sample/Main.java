package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Что тебе лень считать в уме, ленивая жопка?");
        primaryStage.setScene(new Scene(root, 700, 200));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
