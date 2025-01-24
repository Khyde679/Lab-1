package MakingChange;
import java.util.Scanner;

public class Register {
    private Purse purse;

    public Purse getPurse() {
        return purse;
    }

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    public Register() {
        purse = new Purse();
    }

    public Purse makeChange(double amt) {
        for (Denomination i: Currency.USCURRENCY){
            int quant = (int)(amt / i.amt());
            if (quant != 0) {
                purse.add(i, quant);
            }
            amt -= (quant * i.amt());
        }
        return purse;

    }

    public static void main(String[] args) {
        Register register = new Register();
        Purse purse = register.getPurse();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a dollar amount: ");
        double amt = scan.nextDouble();

        System.out.println(register.makeChange(amt));
    }
}
