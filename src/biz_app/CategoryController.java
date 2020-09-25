/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz_app;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class CategoryController implements Initializable {
    @FXML
    private JFXComboBox<?> suppliedby;

    @FXML
    private JFXTextArea describ;

    @FXML
    private JFXTextField bizname3121;

    @FXML
    private JFXTextField name;

    @FXML
    private TableColumn<?, ?> tname;

    @FXML
    private TableColumn<?, ?> tdescription;

    @FXML
    private JFXComboBox<?> brand;

    @FXML
    private TableColumn<?, ?> tsupplier;

    @FXML
    private TableColumn<?, ?> tbrand;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
