
import org.netbeans.j2ee.wsdl.bookingservice.java.bookingservice.Fault1;
import service.StringArray;

/**
 *
 * @author AMore
 */
public class Test {
    
    
    public static void main(String... args) throws Fault1{
    
        System.out.println("RouteService: " + checkRoute("andre", "word", "oslo", "berlin").getArray().toString());

        System.out.println("AvailabilityService: " + checking("andre", "word", "Oslo:Stockholm:Berlin", "28").getArray().toString());
        
        System.out.println("BookingService: " + bookingServiceOperation("andre", "word", "TICKET_1", "1234-3213-3333-4423") );
    }

    private static StringArray checking(java.lang.String username, java.lang.String password, java.lang.String routes, java.lang.String travelDate) {
        service.Availability_Service service = new service.Availability_Service();
        service.Availability port = service.getAvailabilityPort();
        return port.checking(username, password, routes, travelDate);
    }

    private static StringArray checkRoute(java.lang.String username, java.lang.String password, java.lang.String source, java.lang.String destination) {
        service.RouteService_Service service = new service.RouteService_Service();
        service.RouteService port = service.getRouteServicePort();
        return port.checkRoute(username, password, source, destination);
    }

    private static String bookingServiceOperation(java.lang.String username, java.lang.String password, java.lang.String ticketID, java.lang.String creditCardNumber) throws Fault1 {
        org.netbeans.j2ee.wsdl.bookingservice.java.bookingservice.BookingServiceService service = new org.netbeans.j2ee.wsdl.bookingservice.java.bookingservice.BookingServiceService();
        org.netbeans.j2ee.wsdl.bookingservice.java.bookingservice.BookingServicePortType port = service.getBookingServicePort();
        return port.bookingServiceOperation(username, password, ticketID, creditCardNumber);
    }
    
    
    
}
