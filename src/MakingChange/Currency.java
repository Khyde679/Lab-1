package MakingChange;

public class Currency {
    static final Denomination[] USCURRENCY = new Denomination[] {
            new Denomination("One Hundred", 100, "bill", "images/hundred.png"),
            new Denomination("Fifty", 50, "bill", "images/fifty.png"),
            new Denomination("Twenty", 20, "bill", "images/twenty.png"),
            new Denomination("Ten", 10, "bill", "images/ten.png"),
            new Denomination("Five", 5, "bill", "images/five.png"),
            new Denomination("One", 1, "bill", "images/one.png"),

            new Denomination("Quarter", .25, "coin", "images/quarter.png"),
            new Denomination("Dime", .10, "coin", "images/dime.png"),
            new Denomination("Nickel", .05, "coin", "images/nickel.png"),
            new Denomination("Penny", .01, "coin", "images/penny.png")
    };
}
