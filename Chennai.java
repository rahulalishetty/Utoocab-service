public class Chennai {
    public static void getCab(){
        String location="Chennai";
        Cab micro=new Micro(location);
        Cab mini=new Mini(location);
        Cab sedan=new Sedan(location);

        System.out.println("cab services in "+location);
        System.out.println("micro price:"+micro.getCost());
        System.out.println("mini price:"+mini.getCost());
        System.out.println("sedan price:"+sedan.getCost());

    }
}
