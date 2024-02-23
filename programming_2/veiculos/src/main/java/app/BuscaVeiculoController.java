package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import model.Motorista;
import model.Veiculo;
import model.UsoVeiculo;
import util.Dao;
import java.io.Console;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class BuscaVeiculoController {
    @FXML
    private ListView<String> drivers;

    @FXML
    private ComboBox<Veiculo> vehicles;

    @FXML
    private DatePicker datePicker;

    private Dao<Veiculo> daoVehicle;

    private Dao<UsoVeiculo> daoVehicleUse;

    @FXML
    private void initialize() {
        daoVehicle = new Dao(Veiculo.class);
        daoVehicleUse = new Dao(UsoVeiculo.class);

        List<Veiculo> getVehicles = daoVehicle.getAll();
        ObservableList<Veiculo> getVehiclesObservable = FXCollections.observableArrayList(getVehicles);
        vehicles.setItems(getVehiclesObservable);
    }
}
