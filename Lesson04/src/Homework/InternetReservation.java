/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/8/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class InternetReservation extends Reservation {

    public InternetReservation(int hourOfDay, String name, int numberOfPeople, String website){
        super(hourOfDay,name,numberOfPeople);
        this.website = website;
    }

    String website;

    @Override
    public String toString() {

        return name +  " has a reservation at: " +hourOfDay + " for " + numberOfPeople +" from website:"+ website;
    }

}
