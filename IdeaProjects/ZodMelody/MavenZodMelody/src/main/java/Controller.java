
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {
    int muz = 0;
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
        Score = 0;

    }

    public static int getScore() {
        return Score;
    }

    public static void setScore(int score) {
        Score = score;
    }

    public static void setMelodyPath(String melodyPath) {
        zodMelody = new Music(melodyPath);
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
    private void equalsMelodys(Button btn) {
        zodMelody.stop();
        if (btn.getText().equals(getMelodyName())) {
            Score += 1;
        }
        stageControl.hide();
        main.showNextForm();
        //LabelPlayerScore.setText(String.valueOf(Score));
    }

    @FXML
    public void btnPlayMelody(ActionEvent actionEvent) {
        zodMelody.play();
    }

    @FXML
    public void OnClickMethodOpenNextForm(ActionEvent actionEvent) {

        stageControl.hide();
        if (muz < 4) {
            if (muz == 0) {
                muz++;
                main.showForm2();

            } else if (muz == 1) {
                main.showForm3();
            } else if (muz == 2) {
                main.showForm4();
            } else if (muz == 3) {
                main.showForm5();
            }

            muz++;
        }
    }
    @FXML
    public void OnClickMethodSavePoints(ActionEvent actionEvent) {

    }

    @FXML
    public void OnClickMethodPause(ActionEvent actionEvent) {
        zodMelody.pause();
    }
}


