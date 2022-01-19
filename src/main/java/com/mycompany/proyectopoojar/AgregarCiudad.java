/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test1;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author PC
 */
public class AgregarCiudad {
    @FXML
    private void switchToAdministrarCiudad() throws IOException{
        App.setRoot("AdministrarCiudades");
    }
}
