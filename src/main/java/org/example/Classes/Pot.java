package org.example.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = false)
public class Pot extends Product{

    @ToString.Include(rank=1)
    public double volume;

    public Pot(String name, double volume) {
        super(name, "Кастрюля");
        this.volume=volume;
    }
}
