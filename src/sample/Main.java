package sample;

        import javafx.application.Application;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.Pane;
        import javafx.stage.Stage;

        import javax.swing.text.Element;
        import javax.swing.text.html.ImageView;
        import java.awt.*;
        import java.io.File;
        import java.io.FileInputStream;

        import javafx.scene.image.Image;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Guess what city is this!");
        primaryStage.setScene(new Scene(root, 385, 286));


        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
