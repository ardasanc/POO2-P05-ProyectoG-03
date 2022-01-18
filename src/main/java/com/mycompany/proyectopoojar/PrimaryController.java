package com.mycompany.proyectopoojar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PrimaryController implements Initializable{

    
    @FXML
    private void switchTolistaDuenio() throws IOException {
        App.setRoot("listaDuenio");
    }
    @FXML
    private void switchToAdministrarMascota() throws IOException{
        App.setRoot("AdministrarMascota");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
