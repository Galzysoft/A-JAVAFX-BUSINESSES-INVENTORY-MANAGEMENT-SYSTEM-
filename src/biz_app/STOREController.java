/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class STOREController implements Initializable {
     @FXML
    private AnchorPane unit;
     @FXML
    private Tab unittt;
     @FXML
    private Tab supplier;
     @FXML
    private Tab category;
       @FXML
    private Tab brand;
    @FXML
      private void brandd(Event event){
    
    System.out.println("saloowiwa");
    try {  
              FXMLLoader loader=new FXMLLoader(getClass().getResource("Brand.fxml"));
              Parent root =  loader.load();
                
        //        Add_studentController dash = (Add_studentController)loader.getController();
           //    dash.bbb(pased);
           // dash.bbb1(user);
           brand.setContent(root);
 //unit.getChildren().add(root);
       //     ssssssssssssssssss.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } }
     @FXML
      private void supplierr(Event event){
    
    System.out.println("saloowiwa");
    try {  
              FXMLLoader loader=new FXMLLoader(getClass().getResource("Supplier.fxml"));
              Parent root =  loader.load();
                
        //        Add_studentController dash = (Add_studentController)loader.getController();
           //    dash.bbb(pased);
           // dash.bbb1(user);
           supplier.setContent(root);
 //unit.getChildren().add(root);
       //     ssssssssssssssssss.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } }
     @FXML
      private void categoryy(Event event){
    
    System.out.println("saloowiwa");
    try {  
              FXMLLoader loader=new FXMLLoader(getClass().getResource("Category.fxml"));
              Parent root =  loader.load();
                
        //        Add_studentController dash = (Add_studentController)loader.getController();
           //    dash.bbb(pased);
           // dash.bbb1(user);
           category.setContent(root);
 //unit.getChildren().add(root);
       //     ssssssssssssssssss.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } }
@FXML
      private void viewunit(Event event){
    
    System.out.println("saloowiwa");
    try {  
              FXMLLoader loader=new FXMLLoader(getClass().getResource("Unit.fxml"));
              Parent root =  loader.load();
                
        //        Add_studentController dash = (Add_studentController)loader.getController();
           //    dash.bbb(pased);
           // dash.bbb1(user);
           unittt.setContent(root);
 //unit.getChildren().add(root);
       //     ssssssssssssssssss.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            } }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
