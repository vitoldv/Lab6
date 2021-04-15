package org.example.Classes;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Director extends Employee{

    public Director() {
    }

    public Director(String name, double money) {
        super(name, money);
    }

    public void changeProductType (Plant plant, String product_type) {
        plant.setProduct_type(product_type);
    }


}
