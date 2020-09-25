/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ONYEKA
 */
public class supplierstable {
     private final StringProperty NAME;
         private final StringProperty PHONE;
         private final StringProperty ADDRESS;
  private final StringProperty DESCRIPTION;
 
        
 
 
    public supplierstable(String NAME, String PHONE ,String ADDRESS,String DESCRIPTION) {
    
      this.NAME=new SimpleStringProperty(NAME);
            this.PHONE=new SimpleStringProperty(PHONE);
            this.ADDRESS=new SimpleStringProperty(ADDRESS);
              this.DESCRIPTION=new SimpleStringProperty(DESCRIPTION);
              }

 

    public String getName() {
        return NAME.get();
    }
 public String getPhone() {
        return PHONE.get();
    } 
 public String getAddress() {
        return ADDRESS.get();
    } 
 public String getDescription() {
        return DESCRIPTION.get();
    } 
    public void setName(String fName) {
        NAME.set(fName);
    }
     public void setPhone(String fName) {
        PHONE.set(fName);
    }
     public void setAddress(String fName) {
       ADDRESS.set(fName);
    }
     public void setDescription(String fName) {
       DESCRIPTION.set(fName);
    } 
          
    public StringProperty NAMEProperty()
    {return NAME;}
    public StringProperty PHONEProperty()
    {return PHONE;}
    public StringProperty ADDRESSProperty()
    {return ADDRESS;}
     public StringProperty DESCRIPTIONProperty()
    {return DESCRIPTION;}
     

}
