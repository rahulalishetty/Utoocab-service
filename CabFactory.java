public class CabFactory {
    public static void getCab(String location){
        switch (location){
            case "Hyderabad":Hyderabad.getCab();
                            break;
            case "Chennai":Chennai.getCab();
                            break;
            case "Bangalore":Bangalore.getCab();
                            break;
             default:break;
        }
    }
}
