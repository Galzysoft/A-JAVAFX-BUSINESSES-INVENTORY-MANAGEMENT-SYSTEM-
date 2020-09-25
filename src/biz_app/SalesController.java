/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import com.jfoenix.controls.JFXBadge;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class SalesController implements Initializable {
        @FXML
    private AnchorPane hhhh;
  @FXML
    private JFXComboBox<String> saleshistoname;
  @FXML
    private TitledPane cart;
        @FXML
    private JFXTextField cosyumerphone;
      double not=0;
    @FXML
    private StackPane bukas;
     @FXML
    private Label notification;
        @FXML
    private Label notification1;
 
      @FXML
      private void Salesww(KeyEvent event){  
      not=Double.parseDouble(cosyumerphone.getText());
   
      String bb=String.format("%.0f",not);
      if (not<10) {
         notification.setPrefWidth(11);
       
      }
      else if (not>=10 && not<100) {
         notification.setPrefWidth(16);
       
      } else if (not>=100 && not<1000) {
     
         notification.setPrefWidth(30);
       
      }
      else if (not>=1000 && not<10000) {
     
         notification.setPrefWidth(31);
       
      }
      else if (not>=10000 && not<100000) {
     
         notification.setPrefWidth(43);
       
      } else if (not>=100000 && not<1000000) {
     
         notification.setPrefWidth(51);
       
      }
      else if (not>=1000000 && not<10000000) {
     
         notification.setPrefWidth(57);
       
      }
      else if (not>=10000000 && not<100000000) {
     
         notification.setPrefWidth(65);
       
      }
      else if (not>=100000000 && not<1000000000) {
     
         notification.setPrefWidth(73
         );
       
      }
        else if (not>=1000000000 && not<1000000000) {
        notification.setPrefWidth(74);
       }
     
      notification.setText(bb);
      }
  @FXML
      private void Sales(ActionEvent event){  
      //    cart.setExpanded(true);C:\Users\ONYEKA\Documents\NetBeansProjects\BIZ_APP\src\biz_app\images\Maximize Window_52px_2.png
   
      not+=1;
      String bb=String.format("%.0f",not);
      if (not<10) {
         notification.setPrefWidth(11);
       
      }
      else if (not>=10 && not<100) {
         notification.setPrefWidth(22);
       
      } else if (not>=1000 && not<10000) {
     
         notification.setPrefWidth(30);
       
      }
      else if (not>=10000 && not<100000) {
     
         notification.setPrefWidth(43);
       
      } else if (not>=100000 && not<1000000) {
     
         notification.setPrefWidth(51);
       
      }
      else if (not>=1000000 && not<10000000) {
     
         notification.setPrefWidth(57);
       
      }
      else if (not>=10000000 && not<100000000) {
     
         notification.setPrefWidth(65);
       
      }
      else if (not>=100000000 && not<1000000000) {
     
         notification.setPrefWidth(73
         );
       
      }
       else if (not<=1000000000 ) {
     
         notification.setPrefWidth(89
         );
       
      }
     
      notification.setText(bb);
              Image img=new Image("biz_app/images/Download_24px.png");
 ImageView imgview=new ImageView(img);
      bukas.getChildren().add(imgview);
      imgview.toFront();
      double posss=    cart.computeAreaInScreen(); 
      System.out.println("location "+posss);
                                 TranslateTransition transision=new TranslateTransition();
        transision.setDuration(Duration.millis(20000));
transision.setNode(imgview);
transision.setByY (posss);
transision.setCycleCount(1);
transision.setAutoReverse(false);
transision.play();
                  
      System.out.println("done "+posss);        
      }
       @FXML
      private void Sales1(ActionEvent event){  
          saleshistoname.setValue("benooo"); 
      }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     JFXBadge badge =new  JFXBadge(notification1); 
   hhhh.getChildren().add(badge) ;
      //  JFXBadge// TODO
    }    
    
}
