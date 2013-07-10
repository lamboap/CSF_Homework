import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/1/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReservationSystem {

    private List<Reservation> reservationList = new ArrayList<Reservation>();

    private static final int MAX_PEOPLE_PER_HOUR = 50;

    public void listReservation(){

        Collections.sort(reservationList);

         for(Reservation reservation:reservationList){
           System.out.println(reservation);
         }
     }

    public boolean removeReservation(Reservation reservation){

        return reservationList.remove(reservation);

    }

    public String addReservation(Reservation reservation){

        String returnString = "no availability";

        //first check availability
        if(seatingAvailable(reservation)){
            returnString = "confirmed";
            reservationList.add(reservation);
        }
        return returnString;
    }


    private boolean seatingAvailable(Reservation reservation){

        return ( (getTotalPeopleAtHour(reservation)+reservation.numberOfPeople) <= MAX_PEOPLE_PER_HOUR);
    }


    private int getTotalPeopleAtHour(Reservation reservation){

        int total = 0;

        //loop and get total for that hour
        for(Reservation reservation1 : reservationList){
            if(reservation1.hourOfDay == reservation.hourOfDay){
                total += reservation1.numberOfPeople;
            }
        }

        return total;
    }



}
