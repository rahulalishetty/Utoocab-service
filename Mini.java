public class Mini extends Cab {


    public Mini(String location){
        super("Mini",location);
    }
    @Override
    protected double getCost() {
        double price=.0;
        switch (location){
            case "Hyderabad":price=25.00;
                break;
            case "Chennai":price=30.00;
                break;
            case "Bangalore":price=35.00;
                break;
            default:break;
        }
        return price;
    }
}
