package org.example;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import org.example.Classes.Car;
import org.example.Classes.Plant;
import org.example.Classes.Worker;

public class PrimaryController {

    Plant plant = new Plant();
    ObservableList<String> itemsWorkers;
    ObservableList<String> itemsCars;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField workerNameInput;

    @FXML
    private TextField workerMoneyInput;

    @FXML
    private TextField carNameInput;


    @FXML
    private ListView<String> listWorkers=new ListView<String>();//=new ListView<Worker>(listWorkers);

    @FXML
    private ListView<String> listCars=new ListView<String>();//=new ListView<Worker>(listWorkers);


    @FXML
    void buttonProduce(ActionEvent event) {
        String name = carNameInput.getText();
        plant.produce(name);

        itemsCars=FXCollections.observableArrayList(plant.getCarsNamesArray());
        listCars.setItems(itemsCars);

    }

    @FXML
    void buttonHire(ActionEvent event){
        String name=workerNameInput.getText();
        int money=Integer.parseInt(workerMoneyInput.getText());
        Worker worker = new Worker(name, money);

        plant.hire(worker);
        itemsWorkers=FXCollections.observableArrayList(plant.getWorkersNamesArray());
        listWorkers.setItems(itemsWorkers);
    }

    @FXML
    void initialize() {
    }
}
