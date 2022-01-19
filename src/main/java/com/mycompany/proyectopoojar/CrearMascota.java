package com.mycompany.proyectopoojar;

import com.mycompany.proyectopoo.Mascota;
import com.mycompany.proyectopoo.DirigidoA;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ButtonBase;



public class CrearMascota {
    private ComboBox<DirigidoA> cM;
    private TextField nombre;
    private TextField raza;
    private RadioButton perro;
    private RadioButton gato;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToAdministrarMascota() throws IOException{
        App.setRoot("AdministrarMascota");
    }
    
   public void LlenarCombo(){
       for(com.mycompany.proyectopoo.Duenio p: com.mycompany.proyectopoo.DirigidoA.values()){
               cM.getItems().add(p);
        }
   }
   public String guardarNombre(){
       String n=nombre.getText();
       return n;
   }
   public String guardarRaza(){
       String r=raza.getText();
       return r;
   }
   
   public void radioButtons(){
    perro.get
   }
   
   public void 
   Mascota mascota=new Mascota(guardarNombre(),,guardarRaza(),);
   
}
