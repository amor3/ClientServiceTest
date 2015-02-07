
import service.StringArray;

/**
 *
 * @author AMore
 */
public class Test {
    
    
    public static void main(String... args){
    
        System.out.println(checking("andre", "word", "Stockholm:Oslo", "24").getArray().toString());
        
    }

    private static StringArray checking(java.lang.String username, java.lang.String password, java.lang.String routes, java.lang.String travelDate) {
        service.Availability_Service service = new service.Availability_Service();
        service.Availability port = service.getAvailabilityPort();
        return port.checking(username, password, routes, travelDate);
    }
}
