package org.example.Classes;

import org.example.Util;
import lombok.Data;


@Data
public class Car extends Product{

    String title;

    public Car(String title) {
        this.title = title;
    }

    public void ride(){
        Util.messageBox(title + " едет", "Прыихав додому");
    }

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
}