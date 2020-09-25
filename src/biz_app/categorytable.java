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
public class categorytable {
    
  private final StringProperty NAME;
         private final StringProperty SUPPLIER;
         private final StringProperty DESCRIPTION;
         
   private final StringProperty BRAND;
       
 
    public categorytable(String NAME ,String SUPPLIER,String BRAND,String DESCRIPTION) {
    
      this.NAME=new SimpleStringProperty(NAME);
            this.SUPPLIER=new SimpleStringProperty(SUPPLIER);
               this.DESCRIPTION=new SimpleStringProperty(DESCRIPTION);
                   this.BRAND=new SimpleStringProperty(BRAND);
          
              }

 

    public String getName() {
        return NAME.get();
    }
 public String getSUPPLIER() {
        return SUPPLIER.get();
    } 
  public String getBRAND() {
        return BRAND.get();
    } 
  
 
 public String getDescription() {
        return DESCRIPTION.get();
    } 
    public void setName(String fName) {
        NAME.set(fName);
    }
      public void setBrand(String fName) {
        BRAND.set(fName);
    }
     public void setSUPPLIER(String fName) {
        SUPPLIER.set(fName);
    }
    
     public void setDescription(String fName) {
       DESCRIPTION.set(fName);
    } 
          
    public StringProperty NAMEProperty()
    {return NAME;}
      public StringProperty BRANDProperty()
    {return BRAND;}

    public StringProperty SUPPLIERProperty()
    {return SUPPLIER;}
        public StringProperty DESCRIPTIONProperty()
    {return DESCRIPTION;}
     

}
