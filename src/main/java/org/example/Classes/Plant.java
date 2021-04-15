package org.example.Classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.ListIterator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Plant {

    public ArrayList<Worker> workers;
    public ArrayList<Product> products;
    public String product_type;

    public Plant() {
        workers = new ArrayList<Worker>();
        products = new ArrayList<Product>();
        product_type = "";
    }

    public void clearProducts() {
        products.clear();
    }

    public void hire(Worker worker){
        workers.add(worker);
    }

    public void produce(String product_name) {
        for (Worker worker : workers) {
            worker.work();
        }
        if (product_type=="Car") {
            Car car = new Car(product_name);
            products.add(car);
        }
        if (product_type=="Pot") {
            Pot pot = new Pot(product_name, 1);
            products.add(pot);
        }
        if (product_type=="Match") {
            Match match = new Match(product_name);
            products.add(match);
        }
    }

    public ArrayList<String> getWorkersNamesArray(){
        ArrayList<String> names=new ArrayList<String>();
        for (Worker worker : workers) {
            names.add(worker.getName());
        }
        return names;
    }
    public ArrayList<String> getProductsStringArray(){
        ArrayList<String> a=new ArrayList<String>();
        for (Product product : products) {
            a.add(product.toString());
        }
        return a;
    }
}
