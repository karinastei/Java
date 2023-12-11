package Week10.Burger;
class DeluxeBurger extends Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
        this.name = "Deluxe";
        this.meat = "Sausage & Bacon";
        this.price = 14.54;
        this.breadRollType = "White roll";
        this.addition1Name = "Chips";
        this.addition1Price = 2.75;
        this.addition2Name = "Drink";
        this.addition2Price = 1.81;
    }

    // Override methods to prevent additional additions to Deluxe Burger
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");

    }
    @Override
    public double itemizeHamburger() {
        System.out.println(this.name + " on a " + this.breadRollType + " with " + this.meat + ", price is " + this.price);
        System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        double totalPrice = this.price + this.addition1Price + this.addition2Price;
        System.out.println("Total Deluxe Burger price is " + String.format("%.2f", totalPrice));
        return 0;
    }
}
