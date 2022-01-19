package com.mycompany.proyectopoojar;

import com.mycompany.modelo.Ciudad;
import com.mycompany.modelo.Duenio;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListaDuenio {
    
    @FXML
    TableView<Duenio> tvDuenio;
    @FXML
    private TableColumn<Duenio, String> colCedula;
    @FXML
    private TableColumn<Duenio, String> colNombre;
    @FXML
    private TableColumn<Duenio, String> colApellido;
    @FXML
    private TableColumn<Duenio, String> colDireccion;
    @FXML
    private TableColumn<Duenio, String> colTelefono;
    @FXML
    private TableColumn<Duenio, Ciudad> colCiudad;
    @FXML
    private TableColumn<Duenio, String> colEmail;
    @FXML
    private TableColumn<Duenio, Void> colOpc;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
     
    @FXML
    private void initialize() {
        colCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        //agregarOpciones();//en este metodo se llenan los botones para cada fila

    }
    
    public void llenarTabletView() {
        tvDuenio.getItems().setAll(Duenio.cargarDuenios(App.pathDuenio));
    }
}
