/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus TUF
 */

/*
    NIM     : 41425016
    NAMA    : Satria Van Louis Panjaitan
    Motto   : If at first you don't succeed, call it version 1.0.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import java.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }
    @Override public void start(Stage stage)
    {
        Button button = new Button("Click Me");
        button.setOnAction(
            event -> System.out.println(
            "Button clicked!")); // Anonymous object melalui lambda
        
        StackPane root = new StackPane(button);
        stage.setScene(new Scene(root, 300, 200));
        stage.show()
    }
}
