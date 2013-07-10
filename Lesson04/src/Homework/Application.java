import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/1/13
 * Time: 7:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    public static void main(String... args){

       ReservationSystem reservationSystem = new ReservationSystem();
         int i = 0;
        while(i<3){



        Scanner scanner = new Scanner(System.in);

        System.out.println("what type of reservation? phone, website or other.");

        String type = scanner.next();

        System.out.println("enter a time");

        int time = scanner.nextInt();

        System.out.println("enter a name");
        String name = scanner.next();

        System.out.println("enter number of people");
        int numberOfPeople = scanner.nextInt();

       //based off the type ask for either the phone or website


        Reservation reservation = null;

       if (type.equals("phone") || type.equals("website")){
           System.out.print("enter the " + type);
       }

        if(type.equals("phone")){

            String phone = scanner.next();

            reservation = new PhoneReservation(time,name,numberOfPeople, phone);

        } else if (type.equals("website")){

            String website = scanner.next();

            reservation = new InternetReservation(time,name,numberOfPeople, website);
        }  else {
            reservation = new Reservation(time,name,numberOfPeople);
        }


        String replyMsg = reservationSystem.addReservation(reservation);

        System.out.println(replyMsg);


        i++;

        }

        reservationSystem.listReservation();




    }

}
