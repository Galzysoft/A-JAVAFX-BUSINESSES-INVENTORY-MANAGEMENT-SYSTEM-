/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
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
public class SupplierController implements Initializable {String namwmod;Connection con=null;
 private ObservableList<supplierstable> data;
   
    @FXML
    private JFXTextField Supname;
  @FXML
    private JFXTextArea descriptionvvvvv;

    @FXML
    private JFXTextField phone_contact;
  @FXML
    private TableView<supplierstable> tablee;

    @FXML
    private TableColumn<supplierstable, String> address;

    @FXML
    private JFXRadioButton name11;

    @FXML
    private JFXRadioButton name111;

    @FXML
    private TableColumn<supplierstable, String> name;

    @FXML
    private JFXTextField bizname31;
     @FXML
    private JFXTextField addresss;


    @FXML
    private TableColumn<supplierstable, String> description;

    @FXML
    private TableColumn<supplierstable, String> phonec;
    
    
    @FXML
      private void bina(ActionEvent event){
      
      System.out.println("SAVEDDDDDDDDDDDDD");}
    
    @FXML
 private void clear(ActionEvent event){//search1.getSelectedToggle().setSelected(false);
        if (name11.isSelected()) {name11.setSelected(false);
            
        }else  if (name111.isSelected()) {name111.setSelected(false);
            
        }else{System.out.println("vvvv");}
 Supname.setText(null);phone_contact.setText(null);
 addresss.setText(null); 

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
          
     String searchi="UPDATE supplier SET Name='"+Supname.getText()+"',phone='"+phone_contact.getText()+"',Address='"+addresss.getText()+"',Description='"+descriptionvvvvv.getText()+"'  ";

        stmt.executeUpdate(searchi ); refreshtable();
        Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Update");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Suppliers Records Updated  Sucessfully");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();

    } catch (SQLException ex) {
    Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Update");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Suppliers Records  Not Updated");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
  } 

     
                }
     
    
     @FXML
    private void delete( ActionEvent event)     {

  try {
                Statement stmt=(Statement)con.createStatement();
            String insertF="DELETE FROM supplier WHERE Name='"+ namwmod+"'";
           
             
           
            
            stmt.executeUpdate( insertF);refreshtable();
             if (name11.isSelected()) {name11.setSelected(false);
            
        }else  if (name111.isSelected()) {name111.setSelected(false);
            
        }else{System.out.println("vvvv");}
 Supname.setText(null);phone_contact.setText(null);
 addresss.setText(null); 

         Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Delete");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" suppliers Records Deleted Successfully");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();  
        // TODO add your handling code here:
        } catch (SQLException ex) {
           Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Delete");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" suppliers Records Not Deleted ");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();      
        }  }
   @FXML
    private void addd( ActionEvent event)     {
 if(!(Supname.getText().length()==0||phone_contact.getText().length()==0||addresss.getText().isEmpty()||descriptionvvvvv.getText().length()==0))
    {  
    //}
    
       
    
    
    
        String sql="INSERT INTO supplier (Name,phone,Address,Description) VALUES(?,?,?,?) ";
    
           
        PreparedStatement pst;
    try {
        pst = con.prepareStatement(sql);
         pst.setString(1, Supname.getText());
          pst.setString(2, phone_contact.getText());
      pst.setString(3,addresss.getText());
        pst.setString(4,descriptionvvvvv.getText());
            
        pst.executeUpdate();
       /* */refreshtable();
                Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Submision sucessfull");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Supplier sucessfully added ");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
           } catch (SQLException ex) {
      Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
               loginerror1.setTitle("Supplier Not sucessfull added");
               loginerror1.setHeaderText(null);
               loginerror1.setContentText(" Supplier Not sucessfull added Please Review the Name  And TryAgain " );
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
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   connectiondb conne=new connectiondb();
  con= conne.connect();
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
        ResultSet rs=con.createStatement().executeQuery("select * from supplier");
        while (rs.next()){
          //  new supplierstable(rs.getString(1),rs.getString(2),rs.getString(4)));
           data.add(new supplierstable(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
        } }catch(SQLException se){
            System.out.println("Error connecting to database !");
        }
        name.setCellValueFactory(new PropertyValueFactory<>("NAME"));
        phonec.setCellValueFactory(new PropertyValueFactory<>("PHONE" ));
        address.setCellValueFactory(new PropertyValueFactory<>("ADDRESS"));
         description.setCellValueFactory(new PropertyValueFactory<>("DESCRIPTION"));
      tablee.setItems(null);
     tablee.setItems(data);
      //  college.getItems().addAll(data);
              
   }
     @FXML
    private void search( KeyEvent event)  {
        if(name11.isSelected()){
        String g="%";
          data=FXCollections.observableArrayList();
        ResultSet rs;
            try {
                rs = con.createStatement().executeQuery("select * from supplier where Name like '"+bizname31.getText()+g+"'");
         
        while (rs.next()){
         data.add(new supplierstable(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            } }catch(SQLException se){
           Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Filter Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" No Suppliers Records Found Or Make Sure You Typerd The  Correct ID/ REGNO");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
  System.out.println("Error connecting to database !");
        }
       name.setCellValueFactory(new PropertyValueFactory<>("NAME"));
        phonec.setCellValueFactory(new PropertyValueFactory<>("PHONE" ));
        address.setCellValueFactory(new PropertyValueFactory<>("ADDRESS"));
         description.setCellValueFactory(new PropertyValueFactory<>("DESCRIPTION"));
      tablee.setItems(null);
     tablee.setItems(data);
      
         
   
        
        }else if (name111.isSelected()){
        String g="%";
          data=FXCollections.observableArrayList();
        ResultSet rs;
            try {
                rs = con.createStatement().executeQuery("SELECT * FROM supplier WHERE phone  LIKE '"+bizname31.getText()+g+"' ");
         
        while (rs.next()){
          data.add(new supplierstable(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
         } }catch(SQLException se){
            Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Filter Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" No Lectures Records Found Or Make Sure You Typerd The  Correct lecturer Name");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
    
         
   System.out.println("Error connecting to database !");
        }
          name.setCellValueFactory(new PropertyValueFactory<>("NAME"));
        phonec.setCellValueFactory(new PropertyValueFactory<>("PHONE" ));
        address.setCellValueFactory(new PropertyValueFactory<>("ADDRESS"));
         description.setCellValueFactory(new PropertyValueFactory<>("DESCRIPTION"));
      tablee.setItems(null);
     tablee.setItems(data);
        
        }
        
        else{bizname31.setText(""); Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Filter Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" No Search Parameter Selected Make Sure You Select One Phone/ Name");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
      }
    }
      
      @FXML
    private void selected( MouseEvent event)     {


  TableView.TableViewSelectionModel<supplierstable> tvSelContact = 
                tablee.getSelectionModel() 
          ;
  
    tvSelContact.selectedIndexProperty().addListener(new ChangeListener<Number>()
        {
        
        
          public void changed(ObservableValue<? extends Number> changed, 
                    Number oldVal, Number newVal) {
                int index = (int)newVal;
                      namwmod=   data.get(index).getName();
                 
                  Supname.setText(
                        data.get(index).getName());
                 phone_contact.setText(
                        data.get(index).getPhone());
                addresss.setText(
                        data.get(index).getAddress());
                   
                    descriptionvvvvv.setText(
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

    /**
     * Initializes the controller class.
     */
   
