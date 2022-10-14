public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1(0.27, "Tomato");
        hamburger.addHamburgerAddition2(0.75, "Lettuce");
        hamburger.addHamburgerAddition3(1.13, "Cheese");
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1(5.43, "Egg");
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3(50.53, "Should not do this");
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
