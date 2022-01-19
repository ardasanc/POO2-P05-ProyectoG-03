package com.mycompany.proyectopoojar;

import java.io.IOException;
import javafx.fxml.FXML;

public class ListaAuspiciantes {    
    @FXML
    private void switchToCrearAuspiciantes() throws IOException {
        App.setRoot("CrearAuspiciantes");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
}
