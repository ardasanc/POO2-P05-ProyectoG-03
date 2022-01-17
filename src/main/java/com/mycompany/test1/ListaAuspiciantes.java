package com.mycompany.test1;

import java.io.IOException;
import javafx.fxml.FXML;

public class ListaAuspiciantes {

    public static String rutaDuenio = "archivos\duenosP5.csv" ;
    
    @FXML
    private void switchToCrearAuspiciantes() throws IOException {
        App.setRoot("CrearAuspiciantes");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
     
    
    private void LlenarLista(String rutaAuspiciantes){
    
        }
}
