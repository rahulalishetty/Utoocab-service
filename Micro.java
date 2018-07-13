public class Micro extends Cab {

    public Micro(String location){
        super("Mini",location);
    }
    @Override
    protected double getCost() {
        double price=.0;
        switch (location){
            case "Hyderabad":price=20.00;
                break;
            case "Chennai":price=25.00;
                break;
            case "Bangalore":price=30.00;
                break;
            default:break;
        }
        return price;
    }
}
