/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/8/13
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneReservation extends Reservation {

   public PhoneReservation(int hourOfDay, String name, int numberOfPeople, String phone){
         super(hourOfDay,name,numberOfPeople);
         this.phone = phone;

   }

    String phone;

    @Override
    public String toString() {

        return name +  " has a reservation at: " +hourOfDay + " for " + numberOfPeople +" with a phone: "+ phone;
    }


}
