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

        int i=2;
        window(2);
    }

    public static void main(String[] args) {
        launch(args);


    }


    public void window(int i) throws Exception
    {
        if(i==1)
        {
            Stage stageone = new Stage();

            Parent root = FXMLLoader.load(getClass().getResource("one.fxml"));
            stageone.setTitle("Guess what city is this!");
            stageone.setScene(new Scene(root, 385, 286));

            stageone.show();
        }
        if(i==2)
        {
            Stage stagetwo = new Stage();

            Parent root = FXMLLoader.load(getClass().getResource("two.fxml"));
            stagetwo.setTitle("Guess what city is this!");
            stagetwo.setScene(new Scene(root, 385, 286));

            stagetwo.show();
        }
        if(i==3)
        {
            Stage stagethree = new Stage();

            Parent root = FXMLLoader.load(getClass().getResource("three.fxml"));
            stagethree.setTitle("Guess what city is this!");
            stagethree.setScene(new Scene(root, 385, 286));

            stagethree.show();
        }

    }

}
