/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ONYEKA
 */
public class BIZ_APP extends Application {
     private double xoffset=0;
       private double yoffset=0;
  
    @Override
    public void start(Stage stage)   {
          Parent root=null;
         try {
             root = FXMLLoader.load(getClass().getResource("Sign_up.fxml"));
         } catch (IOException ex) {
             Logger.getLogger(BIZ_APP.class.getName()).log(Level.SEVERE, null, ex);
         }
     
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
          stage.setResizable(false);stage.centerOnScreen();
            stage.initStyle(StageStyle.UNDECORATED); 
            root.setOnMousePressed((MouseEvent event) -> {
              xoffset=event.getSceneX();
              yoffset= event.getSceneY();
              });           root.setOnMouseDragged((MouseEvent event) -> {
              stage.setX(event.getScreenX()-xoffset);
              stage.setY(event.getScreenY()-yoffset);
              }); 
                  
   
   
        stage.show();
        //gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg
          
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
