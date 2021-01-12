package server_management;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Server_Management_Application extends Application{
  
  public static void main(string[] args) {
    launch(args);
  }
  @override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Server Management");
    primaryStage.setScene(new Scene(new Button( text: "Login")));
    primaryStage.show();
  }
  
}
