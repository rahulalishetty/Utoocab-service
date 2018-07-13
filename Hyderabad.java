public class Hyderabad {
    public static void getCab(){

        String location="Hyderabad";
        Cab micro=new Micro(location);
        Cab mini=new Mini(location);
        Cab suv=new Suv(location);

        System.out.println("cab services in "+location);
        System.out.println("micro price:"+micro.getCost());
        System.out.println("mini price:"+mini.getCost());
        System.out.println("suv price:"+suv.getCost());

    }
}
