
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {

    public Button btnAnswer1;
    public Button btnAnswer2;
    public Button btnAnswer3;
    public Label LabelPlayerScore;

    private Main main;
    private static int Score;
    private static String MelodyName;
    private static Music zodMelody;

    public Controller() {
        main = new Main();
        Score=0;
    }

    public static int getScore() {
        return Score;
    }

    public static void setScore(int score) {
        Score = score;
    }

    public static void setMelodyPath(String melodyPath) {
        zodMelody=new Music(melodyPath);
    }

    public static void setMelodyName(String melodyName) {
        MelodyName = melodyName;
    }

    public static String getMelodyName() {
        return MelodyName;
    }

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
        equalsMelodys(btnAnswer3);
    }

    public void btnAnswer2Click(ActionEvent actionEvent) {
        equalsMelodys(btnAnswer2);
    }

    public void btnAnswer1Click(ActionEvent actionEvent) {
        equalsMelodys(btnAnswer1);
    }

    @FXML
    private void equalsMelodys(Button btn){
        if(btn.getText().equals(getMelodyName())){
            Score+=1;
        }
        stageControl.hide();
        main.showNextForm();
        LabelPlayerScore.setText(String.valueOf(Score));
    }

    @FXML
    public void btnPlayMelody(ActionEvent actionEvent) {
        zodMelody.stop();
        zodMelody.play();
    }

    @FXML
    public void OnClickMethodOpenNextForm(ActionEvent actionEvent) {

    }

    @FXML
    public void OnClickMethodSavePoints(ActionEvent actionEvent) {

    }
}


