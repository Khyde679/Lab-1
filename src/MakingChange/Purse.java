package MakingChange;
import javax.swing.*;
import java.util.Map;
import java.util.HashMap;

public class Purse {
    Map<Denomination, Integer> cash;

    public Purse() {
        cash = new HashMap<Denomination, Integer>();
    }

    public void add(Denomination type, int num) {
        cash.put(type, cash.getOrDefault(type, 0) + num);
    }

    public double remove(Denomination type, int num) {
        cash.put(type, cash.getOrDefault(type, 0) - num);
        return cash.get(type) * type.amt();
    }

    public double getValue() {
        double total = 0;
        for (Denomination type : cash.keySet()) {
            total += cash.get(type) * type.amt();
        }

        return total;
    }

    public String toString() {
        String output = "";
        for (Denomination type : cash.keySet()) {
           output += type.name() + ": " + cash.get(type) + "\n";
        }

        if (output == "") {
            output = "Empty Purse";
        }
        return output;
    }
}
