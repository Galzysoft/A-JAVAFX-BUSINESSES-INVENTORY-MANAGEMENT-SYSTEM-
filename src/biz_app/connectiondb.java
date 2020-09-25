/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.stage.Modality;

/**
 *
 * @author ONYEKA
 */
public class connectiondb {
//   
    connectiondb(){}
    public Connection connect(){
    Connection con=null; 
         
    try {
        //   jdbc:mysql://localhost:3306/project_manager?zeroDateTimeBehavior=convertToNull [root on Default schema]
        
       
        
             con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/bizapp", "root","");
  System.out.println("connected successfull"); 
 /* 
          con = (Connection)DriverManager.getConnection("jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2243538", "sql2243538","vZ6%dN2*");
  System.out.println("connected successfull"); 
 
      */ 
        //   String url = "jdbc:mysql://localhost/project_manager";
      } catch (SQLException ex) {
     Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Connection Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Server Timed Out OR UnReachable");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
    
      
      
      }
        return con;
    
    
    }
    
}
