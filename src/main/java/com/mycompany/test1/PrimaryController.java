package com.mycompany.test1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchTolistaDuenio() throws IOException {
        App.setRoot("listaDuenio");
    }
    
    
}
