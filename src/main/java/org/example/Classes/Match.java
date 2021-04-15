package org.example.Classes;
import java.util.Random;

import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = false)
public class Match extends Product {
    @ToString.Exclude
    final double length=1;
    @ToString.Exclude
    boolean ignitable;

    public Match(String name) {
        super(name, "Спички");
        Random rd = new Random();
        ignitable = rd.nextBoolean();
    }
    public Match() {
        super("", "Спички");
        Random rd = new Random();
        ignitable = rd.nextBoolean();
    }
    public boolean ignite() {
        if (ignitable) {
            ignitable = false;
            return true;
        } else {
            return false;
        }
    }
}
