public class Suv extends Cab {

    public Suv(String location){
        super("Mini",location);
    }

    @Override
    protected double getCost() {
        double price=.0;
        switch (location){
            case "Hyderabad":price=35.00;
                break;
            case "Chennai":price=.00;
                break;
            case "Bangalore":price=40.00;
                break;
            default:break;
        }
        return price;
    }
}
