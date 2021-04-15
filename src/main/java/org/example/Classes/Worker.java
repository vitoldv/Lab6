package org.example.Classes;

import lombok.AllArgsConstructor;
import org.example.Util;
import lombok.Data;

@Data
public class Worker extends Employee {

    public Worker(String name, double money) {
        super(name, money);
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

}
