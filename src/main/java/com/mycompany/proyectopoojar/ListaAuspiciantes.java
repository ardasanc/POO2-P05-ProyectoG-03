package com.mycompany.proyectopoojar;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class ListaAuspiciantes {    
    @FXML
    private void switchToCrearAuspiciantes() throws IOException {
        try {
               App.setRoot("CrearAuspiciantes");
           } catch (IOException ex) {
               Alert a=new Alert(Alert.AlertType.ERROR,"Error");
                a.show();
           }
    }
    @FXML
    private void switchToPrimary() throws IOException {
        try {
               App.setRoot("Primary");
           } catch (IOException ex) {
               Alert a=new Alert(Alert.AlertType.ERROR,"Error");
                a.show();
           }
    }
    
}
