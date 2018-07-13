public class Bangalore {
    public static void getCab(){
        String location="Bangalore";
        Cab micro=new Micro(location);
        Cab mini=new Mini(location);
        Cab suv=new Suv(location);
        Cab sedan=new Sedan(location);
        System.out.println("cab services in "+location);
        System.out.println("micro price:"+micro.getCost());
        System.out.println("mini price:"+mini.getCost());
        System.out.println("suv price:"+suv.getCost());
        System.out.println("sedan price:"+sedan.getCost());

    }
}
