package app.Scene;

import app.MoviesPackage.Tickets;
import app.Users.User;
import java.util.List;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

import app.components.UserFormUI;
import app.components.UserTextFieldUI;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class UserSceneCreator extends SceneCreator {
    //FlowPane rootGridPane;
    UserFormUI UserUI = new UserFormUI();
    public UserSceneCreator(double width, double height) {
        super(width, height);
        
        //rootGridPane = new FlowPane();
        
        
    }
    
    @Override
    public Scene createScene() {
        return new Scene(UserUI.UserFormUI(), width, height);
        //return new Scene(UserText.UserTextFieldUI(), width, height);
        
                
    }
    
//    @Override
//    public void handle(MouseEvent event) {
//        if (event.getSource() == nameBtn) {
//            System.out.println("this");
//        }
//    }
    
    
    
}