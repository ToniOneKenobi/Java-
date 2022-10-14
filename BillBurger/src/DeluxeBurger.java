public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe","Sausage & Beacon", 14.54, "White Roll");
    }

    @Override
    public void addHamburgerAddition1(double addition1price, String addition1Name) {
        System.out.println("You can't add addition items to the Deluxe Burger!");
    }

    @Override
    public void addHamburgerAddition2(double addition2price, String addition2Name) {
        System.out.println("You can't add addition items to the Deluxe Burger!");
    }

    @Override
    public void addHamburgerAddition3(double addition3price, String addition3Name) {
        System.out.println("You can't add addition items to the Deluxe Burger!");
    }

    @Override
    public void addHamburgerAddition4(double addition4price, String addition4Name) {
        System.out.println("You can't add addition items to the Deluxe Burger!");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Added chips for an extra 2.75");
        double chips = 2.75;
        System.out.println("Added a drink for an extra 1.81");
        double drink = 1.81;
        return chips+drink+super.itemizeHamburger();
    }
}
