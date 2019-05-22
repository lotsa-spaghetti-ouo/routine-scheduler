package program;

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
    private static SampleController mainController;

    @Override
    public void start(Stage primaryStage) throws Exception{
        pStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/program/mainWindow.fxml"));
        //primaryStage.setTitle("new database - Routine Scheduler");
        primaryStage.setScene(new Scene(root, 335, 600));
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void setMainController(SampleController mc) {
        mainController = mc;
    }

    public static SampleController getMainController() {
        return mainController;
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

    public enum PRIORITY {
        LOW,
        MED,
        HIGH
    }
}