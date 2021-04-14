package org.example.Classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.ListIterator;

import lombok.Data;

@Data
public class Plant {

    ArrayList<Worker> workers;
    ArrayList<Car> cars;

    public Plant() {
        workers = new ArrayList<Worker>();
        cars = new ArrayList<Car>();
    }


    public static int prod_num=0;

    public void hire(Worker worker){
        workers.add(worker);
    }

    public void produce(String car_title) {
        prod_num++;
        for (Worker worker : workers) {
            worker.work();
        }
        Car car = new Car(car_title);
        cars.add(car);
    }

    public ArrayList<String> getWorkersNamesArray(){
        ArrayList<String> names=new ArrayList<String>();
        for (Worker worker : workers) {
            names.add(worker.getName());
        }
        return names;
    }

    public ArrayList<String> getCarsNamesArray(){
        ArrayList<String> names=new ArrayList<String>();
        for (Car car : cars) {
            names.add(car.getTitle());
        }
        return names;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setProducts(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
