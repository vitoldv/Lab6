package org.example.Classes;

import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
public class MyThread extends Thread{

    @NonNull
    public double num1;
    @NonNull
    public double num2;
    @Getter
    public double result;

    public void setNums (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        result = num1+num2;
    }


}