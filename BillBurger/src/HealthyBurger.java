public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy Burger", meat, price, "Healthy bread type!");
    }
    public void addHealthyAddition1(String healthyName, double healthyPrice){
    this.healthyExtra1Name=healthyName;
    this.healthyExtra1Price=healthyPrice;
    }
    public void addHealthyAddition2(String healthy1Name, double healthy1Price){
        this.healthyExtra2Name=healthy1Name;
        this.healthyExtra2Price=healthy1Price;

    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price ;
    }
}
