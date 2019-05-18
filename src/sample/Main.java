package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.time.LocalDate;

public class Main extends Application {

    static LocalDate currDate;
    private static Stage pStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        pStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("new database - Task List");
        primaryStage.setScene(new Scene(root, 335, 600));
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void setCurrDate(LocalDate date) {
        currDate = date;
    }

    public static LocalDate getCurrDate() {
        return currDate;
    }

    public static Stage getPStage() {
        return pStage;
    }
}
