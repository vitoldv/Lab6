package org.example.Classes;

import lombok.ToString;
import org.example.Util;
import lombok.Data;

@ToString(callSuper = true, includeFieldNames = false)
public class Car extends Product{

    public Car(String name) {
        super(name, "Автомобиль");
    }

    public void ride(){
        Util.messageBox("Автомобиль " + name + " едет", "Прыихав додому");
    }

}