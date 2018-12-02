package sample;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.*;

public class Controller implements Initializable {


    public Button btnButton;
    public TextField textcityfield;
    public Button button1;

    @Override
    public void initialize(URL location, ResourceBundle resources) { }

    public void cityfield(javafx.event.ActionEvent actionEvent) { }

    public void but1(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stageone = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("one.fxml"));
        stageone.setTitle("Guess what city is this!");
        stageone.setScene(new Scene(root, 385, 286));

        stageone.show();

    }
    public void checkit1(javafx.event.ActionEvent actionEvent) {

        if (textcityfield.getText().trim().equals("Częstochowa" )){
            String a = "Gratulacja!!";
            JOptionPane.showMessageDialog(null, a);}
        else
        {
            JOptionPane.showMessageDialog(null, "Nieprawidłowe miasto");
        }

    }

    public void but2(javafx.event.ActionEvent actionEvent) throws IOException {

        Stage stagetwo = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("two.fxml"));
        stagetwo.setTitle("Guess what city is this!");
        stagetwo.setScene(new Scene(root, 385, 286));

        stagetwo.show();
    }

    public void but3(javafx.event.ActionEvent actionEvent) throws IOException {
        Stage stagetwo = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("three.fxml"));
        stagetwo.setTitle("Guess what city is this!");
        stagetwo.setScene(new Scene(root, 385, 286));

        stagetwo.show();
    }

    public void checkit3(javafx.event.ActionEvent actionEvent) {

        if (textcityfield.getText().trim().equals("Gdańsk" )){
            String a = "Gratulacja!!";
            JOptionPane.showMessageDialog(null, a);}
        else
        {
            JOptionPane.showMessageDialog(null, "Nieprawidłowe miasto");
        }
    }

    public void checkit2(javafx.event.ActionEvent actionEvent) {

        if (textcityfield.getText().trim().equals("Poznań" )){
            String a = "Gratulacja!!";
            JOptionPane.showMessageDialog(null, a);}
        else
        {
            JOptionPane.showMessageDialog(null, "Nieprawidłowe miasto");
        }
    }

    public void exitbtn(javafx.event.ActionEvent actionEvent) {
        Platform.exit();
    }
}

