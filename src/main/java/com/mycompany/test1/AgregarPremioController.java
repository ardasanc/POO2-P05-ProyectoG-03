package com.mycompany.test1;

import com.mycompany.test1.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class AgregarPremioController {
     @FXML
    private void switchToCrearConcurso() throws IOException {
        App.setRoot("AgregarPremio");
    }

}