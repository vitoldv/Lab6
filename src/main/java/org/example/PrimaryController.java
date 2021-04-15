package org.example;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import org.example.Classes.*;

public class PrimaryController {


    Plant plant = new Plant();
    Shop shop = new Shop();
    Director director=new Director();
    ObservableList<String> itemsWorkers=FXCollections.observableArrayList();
    ObservableList<String> itemsProducts=FXCollections.observableArrayList();
    ObservableList<String> itemsShop=FXCollections.observableArrayList();;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField workerNameInput;

    @FXML
    private TextField workerMoneyInput;

    @FXML
    private TextField productNameInput;

    @FXML
    private Label ProductionFocus;

    @FXML
    private ListView<String> listWorkers=new ListView<String>();

    @FXML
    private ListView<String> listProducts=new ListView<String>();

    @FXML
    private ListView<String> listShop=new ListView<String>();

    @FXML
    void buttonProduce(ActionEvent event) {
        if (!plant.getProduct_type().equals("")) {
            String name = productNameInput.getText();
            plant.produce(name);

            itemsProducts.setAll(plant.getProductsStringArray());
            listProducts.setItems(itemsProducts);
        }
        else {
            Util.messageBox("", "Не выбран продукт производства");
        }
    }

    @FXML
    void buttonHire(ActionEvent event){
        String name=workerNameInput.getText();
        int money=Integer.parseInt(workerMoneyInput.getText());
        Worker worker = new Worker(name, money);
        plant.hire(worker);

        itemsWorkers.setAll(plant.getWorkersNamesArray());
        listWorkers.setItems(itemsWorkers);
    }

    @FXML
    void sendProducts(ActionEvent event) {
        shop.setProducts(plant.getProducts());
        itemsShop.addAll(itemsProducts);

        plant.clearProducts();
        itemsProducts.clear();

        listShop.setItems(itemsShop);
        listProducts.setItems(itemsProducts);
    }

    @FXML
    void buttonCarProduction(ActionEvent event) {
        director.changeProductType(plant, "Car");
        ProductionFocus.setText("Автомобили");
    }

    @FXML
    void buttonMatchProduction(ActionEvent event) {
        director.changeProductType(plant, "Match");
        ProductionFocus.setText("Спички");
    }

    @FXML
    void buttonPotProduction(ActionEvent event) {
        director.changeProductType(plant, "Pot");
        ProductionFocus.setText("Кастрюли");
    }

    @FXML
    void initialize() {
    }
}
