import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MainForm.fxml"));
            primaryStage.setTitle("Hello SUPERMAN");
            primaryStage.setScene(new Scene(root, 506, 443));
            primaryStage.setResizable(false);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            Controller controller=new Controller();
            controller.stageControl=primaryStage;
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void showForm1() {
        try {
            Parent e = FXMLLoader.load(this.getClass().getResource("Form1.fxml"));
            Stage playWindow = new Stage();
            playWindow.setTitle("Задание 1");
            playWindow.initStyle(StageStyle.UNDECORATED);
            playWindow.setScene(new Scene(e, 600.0D, 467.0D));
            playWindow.setResizable(false);
            Controller controller = new Controller();
            Controller.setMelodyPath("/Sounds/AC-DC - Highway To Hell (Supernatural OST).mp3");
            Controller.setMelodyName("AC-DC - Highway To Hell");
            controller.stageControl = playWindow;
            playWindow.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showNextForm() {
        try {
            Parent e = FXMLLoader.load(this.getClass().getResource("NextForm.fxml"));
            Stage playWindow = new Stage();
            playWindow.setTitle("Что дальше");
            playWindow.initStyle(StageStyle.UNDECORATED);
            playWindow.setScene(new Scene(e, 600.0D, 467.0D));
            playWindow.setResizable(false);
            Controller controller = new Controller();
            controller.stageControl = playWindow;
            playWindow.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
