
import javafx.event.*;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class Controller {

    public Button btn1;
    public Frame AP1;

    public void OnClickMethod(ActionEvent actionEvent) {
        Parent root = FXMLLoader.load(getClass().getResource("F1.fxml"));
        AP1.setTitle("Hello World");
        AP1.setScene(new Scene(root, 500, 500));
        AP1.show();
    }
}


