package org.example.Classes;
import java.util.Random;

import lombok.Data;

@Data
public class Match extends Product{

    double length;
    boolean ignitable;

    public Match(){
        Random rd = new Random();
        ignitable=rd.nextBoolean();
    }

    public Match(double length, boolean ignitable) {
        this.length = length;
        this.ignitable = ignitable;
    }

    public boolean ignite(){
        if (ignitable==true) {
            ignitable = false;
            return true;
        }
        else{
            return false;
        }

    }

//    public boolean isIgnitable() {
//        return ignitable;
//    }
//
//    public void setIgnitable(boolean ignitable) {
//        this.ignitable = ignitable;
//    }
}
