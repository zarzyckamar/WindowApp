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
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayerBuilder;
import javafx.stage.Stage;

import javax.print.attribute.standard.Media;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
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

    public void checkit1(javafx.event.ActionEvent actionEvent) {

        if (textcityfield.getText().trim().equals("Częstochowa" ) || textcityfield.getText().trim().equals("częstochowa")){
            String a = "Congratulations its a correct city!!";
            audioclipcorrect();
            JOptionPane.showMessageDialog(null, a);}
        else
        {
            audioclipfail();
            JOptionPane.showMessageDialog(null, "Uncorrect city name");
        }
        Platform.exit();

    }

    public void checkit2(javafx.event.ActionEvent actionEvent) {

        if (textcityfield.getText().trim().equals("Poznań" ) || textcityfield.getText().trim().equals("poznań")){
            String a = "Congratulations its a corret city!!";
            audioclipcorrect();
            JOptionPane.showMessageDialog(null, a);

        }
        else
        {
            audioclipfail();
            JOptionPane.showMessageDialog(null, "Uncorrect city name");
        }
        Platform.exit();
    }

    public void checkit3(javafx.event.ActionEvent actionEvent) {

        if (textcityfield.getText().trim().equals("Gdańsk" ) || textcityfield.getText().trim().equals("gdańsk") ){
            String a = "Congratulations its a corret city!!";
            audioclipcorrect();
            JOptionPane.showMessageDialog(null, a);
        }
        else
        {
            audioclipfail();
            JOptionPane.showMessageDialog(null, "Uncorrect city name");
        }
        Platform.exit();
    }

    public void checkit4(javafx.event.ActionEvent actionEvent) {

        if (textcityfield.getText().trim().equals("Bolesławiec" ) || textcityfield.getText().trim().equals("bolesławiec") ){
            String a = "Congratulations its a corret city!!";
            audioclipcorrect();
            JOptionPane.showMessageDialog(null, a);
        }
        else
        {
            audioclipfail();
            JOptionPane.showMessageDialog(null, "Uncorrect city name");
        }
        Platform.exit();
    }

    public void checkit5(javafx.event.ActionEvent actionEvent) {

        if (textcityfield.getText().trim().equals("Wrocław" ) || textcityfield.getText().trim().equals("wrocław") ){
            String a = "Congratulations its a corret city!!";
            audioclipcorrect();
            JOptionPane.showMessageDialog(null, a);
        }
        else
        {
            audioclipfail();
            JOptionPane.showMessageDialog(null, "Uncorrect city name");
        }
        Platform.exit();
    }

    public void audioclipcorrect()
    {
        AudioClip clip = new AudioClip(this.getClass().getResource("sound/bravo.mp3").toString());
        clip.play();
    }
    public void audioclipfail()
    {
        AudioClip clip = new AudioClip(this.getClass().getResource("sound/fail.mp3").toString());
        clip.play();
    }

}

