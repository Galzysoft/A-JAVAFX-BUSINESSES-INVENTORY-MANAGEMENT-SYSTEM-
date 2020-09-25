/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXNodesList;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.Timer;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class MainbodyController implements Initializable {private int count=0;int salesindicatpor=0;int homeindic=0;int storeindic=0;int employeeindicatpor=0;int settingsindic=0;int aboutindic=0;
     // Stage stage1 = (Stage) MAINPANELL.getScene().getWindow();

         
@FXML
    private Label d11;

    @FXML
    private JFXButton home12;

    @FXML
    private HBox basepane;
    @FXML
    private BorderPane MAINPANELL;
    @FXML
    private JFXButton home1111;

    @FXML
    private JFXNodesList list;

    @FXML
    private Label d1;

    @FXML
    private JFXButton click;

    @FXML
    private Label d3;

    @FXML
    private JFXButton home;

    @FXML
    private JFXButton exit;

    @FXML
    private HBox bar;

    @FXML
    private JFXButton home111;

    @FXML
    private JFXButton logout;
  @FXML
    private VBox v1;

    @FXML
    private VBox v3;
    @FXML
    private VBox vbbox;

    @FXML
    private VBox www;

    @FXML
    private JFXHamburger viewdrawer;

    @FXML
    private VBox v11;

    @FXML
    private JFXButton home11;

    @FXML
    private HBox barod;

    
    @FXML
    private BarChart<?, ?> chart;

      @FXML
    private HBox dham;

    @FXML
    private JFXButton home1;

     private  Timer t,t1;private double xoffset=0;
       private double yoffset=0;
       
       
       
        @FXML
      private void Sales(ActionEvent event){  
            if (salesindicatpor==0) {      
         salesindicatpor=1;
             //salesindicatpor=0;
               employeeindicatpor=0;
               aboutindic=0;
               homeindic=0;
      settingsindic=0;
          storeindic=0;
     try {
         
           FXMLLoader loader=new FXMLLoader(getClass().getResource("Sales.fxml"));
              Parent root =  loader.load();
           
         
                 


            MAINPANELL.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } 
     
    
            }  
     
        }
   
       
       
          @FXML
      private void Emplotee(ActionEvent event){  
            if (employeeindicatpor==0) {      
         salesindicatpor=0;
             //salesindicatpor=0;
               employeeindicatpor=1;
               aboutindic=0;
               homeindic=0;
      settingsindic=0;
          storeindic=0;
     try {
         
           FXMLLoader loader=new FXMLLoader(getClass().getResource("Employee.fxml"));
              Parent root =  loader.load();
           
         
                 


            MAINPANELL.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } 
     
    
            }  
     
        }
  
       
       
    @FXML
     private void STORE(ActionEvent event){  
     
         if (storeindic==0) {
            storeindic=1;
               salesindicatpor=0;
               employeeindicatpor=0;
               aboutindic=0;
               homeindic=0;
      settingsindic=0;
         
         
     try {
         
           FXMLLoader loader=new FXMLLoader(getClass().getResource("STORE.fxml"));
              Parent root =  loader.load();
           
         
                 


            MAINPANELL.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } 
     
         }
        }
     
      @FXML
      private void dashboard(ActionEvent event){  
     
          if (homeindic==0) {
               salesindicatpor=1;
             salesindicatpor=0;
               employeeindicatpor=0;
               aboutindic=0;
               homeindic=1;
      settingsindic=0;
          storeindic=0;
              
          
         
     try {
         
           FXMLLoader loader=new FXMLLoader(getClass().getResource("Dashboard.fxml"));
              Parent root =  loader.load();
           
         
                 


            MAINPANELL.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } 
          }
     
        }
   
     
 @FXML
    private void logout(ActionEvent event)throws IOException{
   Stage stage;
    Stage stage1 = (Stage) logout.getScene().getWindow();
                Parent root;
            //if(event.getSource()==btn){
                    stage = new Stage();
                    FXMLLoader loader=new FXMLLoader(getClass().getResource("Sign_up.fxml"));
             
              root =  loader.load();
                
              
              
                    stage.setScene(new Scene(root));
                    stage.initModality(Modality.NONE);
                    stage.initOwner(barod.getScene().getWindow());
                    stage.setResizable(false);
                    stage.initStyle(StageStyle.UNDECORATED);
                    //
                    
                    
                    
                   // stage.centerOnScreen();
                    //scene.getStylesheets().add(STUDENT_PROJECT_MANAGEMENTSYS.class.getResource("sign_up.css").toExternalForm());
                        stage1.close();
         
                         root.setOnMousePressed((MouseEvent event1) -> {
                             xoffset = event1.getSceneX();
                             yoffset = event1.getSceneY();
   });           root.setOnMouseDragged((MouseEvent event1) -> {
       stage.setX(event1.getScreenX() - xoffset);
       stage.setY(event1.getScreenY() - yoffset);
   });
                        
                        
                        
                    stage.showAndWait();
                    
                  
                //  stage.showAndWait();
                    
                 }
  
 @FXML
     private void minimize(ActionEvent event){
        
            ((Stage)  barod.getScene().getWindow()).setIconified(true);
       
          
     
     }
     @FXML
     private void sysys(ActionEvent event){
         System.out.println("youuuuuvgggg");}
    
     @FXML
     private void maximize(ActionEvent event){
//        if(   ((Stage)  barod.getScene().getWindow()).isMaximized()
//     ){
//            ((Stage)  barod.getScene().getWindow()).setMaximized(false);
//        }else{   ((Stage)  barod.getScene().getWindow()).setMaximized(true);
//     }
//          
     
     }
     @FXML
    private void ButtonActione(ActionEvent event) {
    System.exit(0);}
    @FXML
    private void res(Event event) {
        double b=MAINPANELL.getWidth();
        if(b<=989.0){  System.out.println("ballooo  "+ MAINPANELL.getWidth());
     
  }
           
   }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         
    // calling the dashboard fxml
        try {
         
           FXMLLoader loader=new FXMLLoader(getClass().getResource("Dashboard.fxml"));
              Parent root =  loader.load();
           
         
                 


            MAINPANELL.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } 
     
     

        
          System.out.println("obidogo");
       
    /*
    JFXButton ll=new JFXButton("U");
           ll.setButtonType(JFXButton.ButtonType.RAISED);
 ll.getStyleClass().addAll("animated.option.button","animated.option.sub.button");
 System.out.println("obidogo1");
        JFXButton logout=new JFXButton("logout");
          logout.setButtonType(JFXButton.ButtonType.RAISED);
     logout.getStyleClass().addAll("animated.option.button","animated.option.sub.button1");
 System.out.println("obidogo2");
          JFXButton exit=new JFXButton("Exit");
           exit.setButtonType(JFXButton.ButtonType.RAISED);
      logout.getStyleClass().addAll("animated.option.button","animated.option.sub.button2");
 */
      //  JFXNodesList list= new JFXNodesList();
          //  barod.getChildren().add(list);
      //  www.getChildren().add(list);
     // TODO
    }    
       
    
 
    }
 

