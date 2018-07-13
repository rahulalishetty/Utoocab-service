public abstract class Cab {
    String carType;
    String location;
    public Cab(String carType,String location){
        this.carType=carType;
        this.location=location;
    }

    protected abstract double getCost();

}
