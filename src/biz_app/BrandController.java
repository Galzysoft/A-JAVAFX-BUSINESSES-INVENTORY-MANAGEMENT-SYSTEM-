/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class BrandController implements Initializable {
    private ObservableList<brandtable> data;Connection con=null;String namwmod;

 @FXML
    private JFXComboBox<String> suppliedby;

    @FXML
    private JFXTextField bizname312;

    @FXML
    private JFXTextField name;

    @FXML
    private JFXTextArea description;
  @FXML
    private TableView<brandtable> tableee;
    @FXML
    private TableColumn<brandtable,String> tname;

    @FXML
    private TableColumn<brandtable,String> tdessc;

    @FXML
    private TableColumn<brandtable,String> tsupp;

   @FXML
 private void clear(ActionEvent event){//search1.getSelectedToggle().setSelected(false);
        
 name.setText(null);description.setText(null);
 suppliedby.setValue(null); 

  //name.setSelected(false);
  //search1.selectToggle(name);
  
 
     
 // id.setSelected(false);
 //
 //  name.setSelected(false);
  JFXDialog dialog = new JFXDialog();
dialog.setContent(new Label("Content"));
 dialog.show(); }
      
     @FXML
    private void update( ActionEvent event)     {
         
       
    try { Statement stmt=(Statement)con.createStatement();
          
     String searchi="UPDATE brand SET name='"+name.getText()+"',supplied_by='"+suppliedby.getValue()+"',Brand_description='"+description.getText()+"'  ";

        stmt.executeUpdate(searchi ); refreshtable();
        Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Update");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Brand Records Updated  Sucessfully");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();

    } catch (SQLException ex) {
    Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Update");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Brand Records  Not Updated");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
  } 

     
                }
     
    
     @FXML
    private void delete( ActionEvent event)     {

  try {
                Statement stmt=(Statement)con.createStatement();
            String insertF="DELETE FROM brand WHERE name='"+ namwmod+"'";
           
             
           
            
            stmt.executeUpdate( insertF);refreshtable();
            name.setText(null);description.setText(null);
 suppliedby.setValue(null); 

         Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Delete");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Brand Records Deleted Successfully");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();  
        // TODO add your handling code here:
        } catch (SQLException ex) {
           Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Delete");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Brands Records Not Deleted ");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();      
        }  }
   @FXML
    private void addd( ActionEvent event)     {
 if(!(name.getText().length()==0||suppliedby.getValue().length()==0||description.getText().length()==0))
    {  
    //}
    
       
    
    
    
        String sql="INSERT INTO brand (name,supplied_by,Brand_description) VALUES(?,?,?) ";
    
           
        PreparedStatement pst;
    try {
        pst = con.prepareStatement(sql);
         pst.setString(1, name.getText());
          pst.setString(2, suppliedby.getValue());
      pst.setString(3,description.getText());
              
        pst.executeUpdate();
       /* */refreshtable();
                Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Submision sucessfull");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" brand sucessfully added ");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
           } catch (SQLException ex) {
      Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
               loginerror1.setTitle("brand Not sucessfull added");
               loginerror1.setHeaderText(null);
               loginerror1.setContentText(" brand Not sucessfull added Please Review the Name  And TryAgain " );
               loginerror1.initModality(Modality.APPLICATION_MODAL);
               loginerror1.showAndWait();
    } 
        }else{    Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Empty fields");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText("One Or More Fields Are Empty ");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
  } }
 private void fill_dept_coll(){
        
  
       ObservableList<String>     sdddf=FXCollections.observableArrayList();
         try {   ResultSet rs1=con.createStatement().executeQuery("select Name from supplier");

        while (rs1.next()){
            sdddf.add((rs1.getString(1)));
            
             
        }  
    } catch (SQLException ex) {
     }
         suppliedby.setItems(sdddf);
   
   /*
    ObservableList<String>     data12=FXCollections.observableArrayList();
         try {   ResultSet rs1=con.createStatement().executeQuery("select DEPARTMENT from college_department");

        while (rs1.next()){
            data12.add((rs1.getString(1)));
            
             
        }  
    } catch (SQLException ex) {
        Logger.getLogger(Add_studentController.class.getName()).log(Level.SEVERE, null, ex);
    }
         department.setItems(data12);
   */
   
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   connectiondb conne=new connectiondb();
  con= conne.connect();fill_dept_coll();
    refreshtable();
//      Calendar timer=Calendar.getInstance();
//				 timer.getTime();
//				 SimpleDateFormat tTime=	new SimpleDateFormat("HH:mm:ss");
//				 tTime.format( timer.getTime());
//				 SimpleDateFormat tDate=new SimpleDateFormat("yyyy");
//				 tDate.format(timer.getTime());
//				String datea =( tDate.format(timer.getTime()));
//				String time =( tTime.format(timer.getTime()));
//session.setText(datea);

    // TODO
    }    
     
   private void refreshtable()  {
   
   try{
       
        data=FXCollections.observableArrayList();
        ResultSet rs=con.createStatement().executeQuery("select * from brand");
        while (rs.next()){
          //  new supplierstable(rs.getString(1),rs.getString(2),rs.getString(4)));
           data.add(new brandtable(rs.getString(1),rs.getString(2),rs.getString(3)));
        } }catch(SQLException se){
            System.out.println("Error connecting to database !");
        }
        tname.setCellValueFactory(new PropertyValueFactory<>("NAME"));
        tsupp.setCellValueFactory(new PropertyValueFactory<>("SUPPLIER" ));
            tdessc.setCellValueFactory(new PropertyValueFactory<>("DESCRIPTION"));
      tableee.setItems(null);
     tableee.setItems(data);
      //  college.getItems().addAll(data);
              
   }
     @FXML
    private void search( KeyEvent event)  {
                try {
                    String g="%";
          data=FXCollections.observableArrayList();
        ResultSet rs;
        
                rs = con.createStatement().executeQuery("select * from brand where name like '"+bizname312.getText()+g+"'");
         
        while (rs.next()){
            data.add(new brandtable(rs.getString(1),rs.getString(2),rs.getString(3)));
        } }catch(SQLException se){
           Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Filter Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" No brand Records Found Or Make Sure You Typerd The  Correct brand name");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
  System.out.println("Error connecting to database !");
        }
       tname.setCellValueFactory(new PropertyValueFactory<>("NAME"));
        tsupp.setCellValueFactory(new PropertyValueFactory<>("SUPPLIER" ));
            tdessc.setCellValueFactory(new PropertyValueFactory<>("DESCRIPTION"));
      tableee.setItems(null);
     tableee.setItems(data);
        
   
        
        } 
    
      
      @FXML
    private void selected( MouseEvent event)     {


  TableView.TableViewSelectionModel<brandtable> tvSelContact = 
                tableee.getSelectionModel() 
          ;
  
    tvSelContact.selectedIndexProperty().addListener(new ChangeListener<Number>()
        {
        
        
          public void changed(ObservableValue<? extends Number> changed, 
                    Number oldVal, Number newVal) {
                int index = (int)newVal;
                      namwmod=   data.get(index).getName();
                   name.setText(
                        data.get(index).getName());
                   
                  suppliedby.setValue(
                        data.get(index).getName());
                      description.setText(
                        data.get(index).getDescription());
                   
              
                 
                 
                }});
                
                
               }
        
          
          
          
          
          
          
          
          
          //nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
      /*  private StringProperty NAME;
        private StringProperty REG_NO;
        private StringProperty DEP;
 private StringProperty COLL;

        private StringProperty SESSS;
    private AttendanceData(String NAME, String REG_NO ,String DEP,String COLL,String SESSS ) {
            this.NAME=new SimpleStringProperty(NAME);
            this.REG_NO=new SimpleStringProperty(REG_NO);
            this.DEP=new SimpleStringProperty(DEP);
              this.COLL=new SimpleStringProperty(COLL);
            this.SESSS=new SimpleStringProperty(SESSS);
          
        }
        public StringProperty NAME(){
            return NAME;
        }
        public StringProperty REG_NO(){
            return REG_NO;
        }
        public StringProperty DEP(){
            return DEP;
        }
         public StringProperty COLL(){
            return COLL;
        } public StringProperty SESSS(){
            return SESSS;
        }
    }
     */
     
    
       
      class SplashScreen extends Thread{
          @Override
          public void run(){
              try {
                  Thread.sleep(100);
                  Platform.runLater(new Runnable() {
                      @Override 
                      public void run() {
             
        
    
                         
                      refreshtable();
                      
                      
                      
                      
                      }
                  });
                  
              } catch (InterruptedException ex) {
                  }
    }
    }  public void bbb(String text){pased=text;}
   public void bbb1(String text){user=text;}
  String user;
 String pased;
}
