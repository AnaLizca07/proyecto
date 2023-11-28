package com.example.proyectofinal_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private TableColumn<Pelicula, String> columClasificacion;

    @FXML
    private TableColumn<Pelicula, LocalDate> columFecha;

    @FXML
    private TableColumn<Pelicula, String> columGenero;

    @FXML
    private TableColumn<Pelicula, String> columProtagonista;

    @FXML
    private TableColumn<Pelicula, String> columTitulo;

    @FXML
    private DatePicker dpFecha;

    @FXML
    private TableView<?> tblRegistro;

    @FXML
    private Label titulo;

    @FXML
    private TextField txtClasificacion;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtProtagonista;

    @FXML
    private TextField txtTitulo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void Agregar(ActionEvent event) {

    }

    @FXML
    void Eliminar(ActionEvent event) {

    }
}