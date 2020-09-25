/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDecorator;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class Sign_upController implements Initializable { 
    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton btn;
@FXML
    private AnchorPane anchoo;

    @FXML
    private JFXTextField username;

private double xoffset=0;
       private double yoffset=0;
         @FXML
     private void minimize(ActionEvent event){
        
            ((Stage)  anchoo.getScene().getWindow()).setIconified(true);
       
          
     
     }@FXML
    private void ButtonActione(ActionEvent event) {
    System.exit(0);}
    @FXML
    private void login(ActionEvent event) throws IOException {
 Stage stage1 = (Stage) btn.getScene().getWindow();

                Stage stage;
                Parent root;
            //if(event.getSource()==btn){
                    stage = new Stage();
                    FXMLLoader loader=new FXMLLoader(getClass().getResource("mainbody.fxml"));
             
              root =  loader.load();
       
  
  stage .setMinWidth(989);stage .setMinHeight(600);
                        stage.setTitle("BizApp");
                     JFXDecorator decorator =new JFXDecorator(stage, root);
decorator.setCustomMaximize(true);

//decorator.setMinWidth(989);
//decorator.setMinHeight(1007);
// root.getStylesheets().add(BIZ_APP.class.getResource("mainoo.css").toExternalForm());

           
Scene scene = new Scene(decorator, 1050, 600);  

    
                  stage.setScene(scene);
             //     stage.initStyle(StageStyle.UNIFIED);
                //  stage.setResizable(true);
                  
                 // stage.setMinHeight(661);
  // stage.setMinWidth(1285);
    
              stage.centerOnScreen(); 
//              root.setOnMousePressed((MouseEvent event1) -> {
//                  xoffset = event1.getSceneX();
//                  yoffset = event1.getSceneY();
// });          
//                      
//              
//              root.setOnMouseDragged((MouseEvent eventa) -> {
//              stage.setX(eventa.getScreenX()-xoffset);
//              stage.setY(eventa.getScreenY()-yoffset);
//              });  stage.centerOnScreen();
//                    //scene.getStylesheets().add(STUDENT_PROJECT_MANAGEMENTSYS.class.getResource("sign_up.css").toExternalForm());
//                    
//                    
                   // btn.getScene().getWindow().hide();
                    stage1.close();

                    stage.show();
                  
              }
   @FXML
    private void ButtonAction(ActionEvent event)throws IOException{
       
        
           Stage stage;
        Parent root;
    
            stage = new Stage();
            root = FXMLLoader.load(getClass().getResource("signup.fxml"));
           Scene sss=new Scene(root);
            stage.setScene(sss);
            
            stage.initModality(Modality.NONE);
                stage.initOwner(btn.getScene().getWindow());
            stage.setResizable(false);
            stage.initStyle(StageStyle.UNDECORATED); 
   stage.centerOnScreen();
           stage.showAndWait();
         }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
