/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class DashboardController implements Initializable {
 @FXML
    private VBox v1;

    @FXML
    private VBox v3;
   
    @FXML
    private HBox bar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       new SplashScreen().start();
        //  calling up the   barview
        
       CategoryAxis ca=new CategoryAxis();
        ca.setLabel("SALES PERSON");
        
        NumberAxis na=new NumberAxis();
        
        na.setLabel("number of cars sold");
        BarChart<String,Number> chart=new BarChart<>(ca,na);
        chart.setTitle("ist Quarter of Sales");
        
        XYChart.Series<String,Number> jan=new XYChart.Series<>();
        XYChart.Series<String,Number> feb=new XYChart.Series<>();
        XYChart.Series<String,Number> march=new XYChart.Series<>();
        jan.setName("JANUARY");
        
        feb.setName("FEBRUARY");
        march.setName("MARCH");
        jan.getData().add(new XYChart.Data<String, Number>("Galzy",100000));
         jan.getData().add(new XYChart.Data<String, Number>("gift",90000));
       
         feb.getData().add(new XYChart.Data<String, Number>("Ebuka",20000));
          feb.getData().add(new XYChart.Data<String, Number>("favour",30000));
        
        march.getData().add(new XYChart.Data<String, Number>("Morgan",50000));
       march.getData().add(new XYChart.Data<String, Number>("Nona",45000));
       
        chart.getData().add(jan);
        chart.getData().add(feb);
        chart.getData().add(march);
        chart.setPrefSize(1142, 200);
        
      //  FlowPane pane =new FlowPane();
        bar.getChildren().add(chart);
               
    }    
              class SplashScreen extends Thread{
          @Override
          public void run(){
              try {
                  Thread.sleep(100);
                  Platform.runLater(new Runnable() {
                      @Override
                      public void run() {
                      
                                 TranslateTransition transision=new TranslateTransition();
        transision.setDuration(Duration.millis(6000));
transision.setNode(v1);
transision.setByX(-280);
transision.setCycleCount(1);
transision.setAutoReverse(false);
transision.play();
                   TranslateTransition transision1=new TranslateTransition();
        transision1.setDuration(Duration.millis(6000));
transision1.setNode(v3);
transision1.setByX(280);
transision1.setCycleCount(1);
transision1.setAutoReverse(false);
transision1.play();
        
              
                      }
                  });
                  
              } catch (InterruptedException ex) {
                  }
    }
    }
}
