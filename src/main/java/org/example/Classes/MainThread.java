package org.example.Classes;

import lombok.*;

import java.util.ArrayList;

@RequiredArgsConstructor
public class MainThread {
    @NonNull
    public ArrayList<Double> VectorA;
    @NonNull
    public ArrayList<Double> VectorB;
    @Getter
    public ArrayList<Double> VectorResult;

    public synchronized void calculate() throws InterruptedException {
        VectorResult=new ArrayList<Double>();
        for(int i = 0; i < 3; i++) {
            MyThread thread = new MyThread();
            thread.setNums(VectorA.get(i), VectorB.get(i));
            thread.start();
            thread.join();
            VectorResult.add(thread.getResult());
        }
    }
}