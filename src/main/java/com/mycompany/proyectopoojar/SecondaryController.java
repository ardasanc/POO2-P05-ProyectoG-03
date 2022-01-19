package com.mycompany.proyectopoojar;

import com.mycompany.modelo.Duenio;
import com.mycompany.modelo.Ciudad;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SecondaryController {
    
    @FXML
    private Button cancel;
    @FXML
    private Button guardar;
    @FXML
    private ChoiceBox<Ciudad> cc;
    @FXML
    private TextField txtfield0;
    @FXML
    private TextField txtfield1;
    @FXML
    private TextField txtfield2;
    @FXML
    private TextField txtfield3;
    @FXML
    private TextField txtfield4;
    @FXML
    private TextField txtfield5;

    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchTolistaDuenio() throws IOException {
        App.setRoot("ListaDuenio");
    }
    
    private void llenarComboBox(List<Ciudad> listaCiudad) {
        
        List<String> listaCiu = new ArrayList<>();
        
        for (Ciudad c : listaCiudad) {
            String nom = c.getNombre();
            
            if (!listaCiu.contains(nom)) {
                listaCiu.add(nom);
            }}
        
        /*listaCiu = listaCiudad.stream()
                                .map(c -> c.getNombre())
                                .distinct()
                                .sorted()
                                .collect(Collectors.toList());*/
        
        //cc.getItems().addAll(listaCiu);
       } 
    
    private void GuardarDuenio(List<Duenio> listaDuenio){
        if(guardar.isPressed()){
            String txt0 = txtfield0.getText();
            String txt1 = txtfield1.getText();
            String txt2 = txtfield2.getText();
            String txt3 = txtfield3.getText();
            String txt4 = txtfield4.getText();
            String txt5 = txtfield5.getText();
            Ciudad ciudad = cc.getValue();
            Duenio d = new Duenio(txt0,txt1,txt2,txt3,txt4,ciudad,txt5);
            listaDuenio.add(d);
        }
    }
    
}