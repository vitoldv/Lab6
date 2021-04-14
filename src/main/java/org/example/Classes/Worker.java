package org.example.Classes;

import org.example.Util;
import lombok.Data;

@Data
public class Worker {
    private String name;
    private double money;

    public Worker(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public boolean smoke(Match match) {
        return igniteMatch(match);
    }
    public boolean igniteMatch(Match match) {
        return match.ignite();
    }
    public void work () {
        Match match = new Match();
        boolean smoke_res = smoke(match);
        if (smoke_res) {
            Util.messageBox("Рабочий " + name, name + " поработал\nПокурить не вышло, спичка не зажглась :(");
        } else
            Util.messageBox("Рабочий " + name, name + " поработал\nСпичка зажглась. " + name + " доволен. " + name + " курнул сижки.");
    }

//    public String getName() {
//        return name;
//    }
//
//    public double getMoney() {
//        return money;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setMoney(double money) {
//        this.money = money;
//    }
}
