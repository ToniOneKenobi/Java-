public class Hamburger {
    public Hamburger(String name, String meat, double price, String breadTypeRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadTypeRoll = breadTypeRoll;
    }

    private String name;
    private String meat;
    private double price;
    private String breadTypeRoll;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1price;
    private double addition2price;
    private double addition3price;
    private double addition4price;

    public Hamburger(String meat, double price) {
    }

    public void addHamburgerAddition1(double addition1price, String addition1Name){
        this.addition1price=addition1price;
        this.addition1Name=addition1Name;
        System.out.println("Added an additional "+this.addition1Name+" for an extra "+this.addition1price);
    }
    public void addHamburgerAddition2(double addition2price, String addition2Name){
        this.addition2price=addition2price;
        this.addition2Name=addition2Name; System.out.println("Added " + this.addition2Name + " for an extra "
                + this.addition2price);

    }
    public void addHamburgerAddition3(double addition3price, String addition3Name){
        this.addition3price=addition3price;
        this.addition3Name=addition3Name;
        System.out.println("Added " + this.addition3Name + " for an extra "
                + this.addition3price);
    }
    public void addHamburgerAddition4(double addition4price, String addition4Name){
        this.addition4price=addition4price;
        this.addition4Name=addition4Name;
        System.out.println("Added " + this.addition4Name + " for an extra "
                + this.addition4price);
    }
    public double itemizeHamburger(){
        return price+this.addition2price+this.addition1price+this.addition3price+this.addition4price;

    }


}
