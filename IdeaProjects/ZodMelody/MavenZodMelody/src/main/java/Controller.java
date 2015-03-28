
import javafx.event.*;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.io.File;

public class Controller {

    private Main main=new Main();
    Music zodMelody=new Music("/Sounds/AC-DC - Highway To Hell (Supernatural OST).mp3");

    @FXML
    public static Stage stageControl;

    @FXML
    public void OnClickStartGame(ActionEvent actionEvent) {
        stageControl.hide();
        main.showForm1();
    }

    @FXML
    public void OnClickMethodCloseMainForm(ActionEvent actionEvent) {
        stageControl.close();
    }

    @FXML
    public void btnStopMelody(ActionEvent actionEvent) {
        zodMelody.stop();
    }

    @FXML
    public void OnClickMethodClose(ActionEvent actionEvent) {
        zodMelody.stop();
        stageControl.close();
    }

    public void btnAnswer3Click(ActionEvent actionEvent) {

    }

    public void btnAnswer2Click(ActionEvent actionEvent) {

    }

    public void btnAnswer1Click(ActionEvent actionEvent) {

    }

    @FXML
    public void btnPlayMelody(ActionEvent actionEvent) {
        zodMelody.stop();
        zodMelody.play();
    }

}


