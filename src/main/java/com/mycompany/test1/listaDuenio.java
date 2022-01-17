package com.mycompany.test1;

import java.io.IOException;
import javafx.fxml.FXML;

public class ListaDuenio {

    public static String rutaDuenio = "archivos\duenosP5.csv" ;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
     
    
    private void LlenarLista(rutaDuenio){
    
        }
}
