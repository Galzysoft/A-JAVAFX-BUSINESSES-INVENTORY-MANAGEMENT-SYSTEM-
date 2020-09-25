package biz_app;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONYEKA
 */
public class brandtable {
  private final StringProperty NAME;
         private final StringProperty SUPPLIER;
         private final StringProperty DESCRIPTION;
         
 
 
    public brandtable(String NAME ,String SUPPLIER,String DESCRIPTION) {
    
      this.NAME=new SimpleStringProperty(NAME);
            this.SUPPLIER=new SimpleStringProperty(SUPPLIER);
               this.DESCRIPTION=new SimpleStringProperty(DESCRIPTION);
              }

 

    public String getName() {
        return NAME.get();
    }
 public String getSUPPLIER() {
        return SUPPLIER.get();
    } 
  
 public String getDescription() {
        return DESCRIPTION.get();
    } 
    public void setName(String fName) {
        NAME.set(fName);
    }
     public void setSUPPLIER(String fName) {
        SUPPLIER.set(fName);
    }
    
     public void setDescription(String fName) {
       DESCRIPTION.set(fName);
    } 
          
    public StringProperty NAMEProperty()
    {return NAME;}
    public StringProperty SUPPLIERProperty()
    {return SUPPLIER;}
        public StringProperty DESCRIPTIONProperty()
    {return DESCRIPTION;}
     

}
