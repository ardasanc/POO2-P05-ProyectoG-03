package com.mycompany.test1;

import java.io.IOException;
import javafx.fxml.FXML;

public class CrearMascota {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToAdministrarMascota() throws IOException{
        App.setRoot("AdministrarMascota");
    }
    
}
