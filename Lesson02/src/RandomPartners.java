import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 6/29/13
 * Time: 6:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class RandomPartners {



   public static void main(String... args) {

       String[] students = {"adrian_bautista", "dustin_coates", "daniel_gabrieli", "chris_goodmacher", "tisha_greenidge",
               "archana_jiwnani", "james_kulina", "derrick_lannaman", "jesse_leone", "hsi-chang_lin", "colin_mcearney", "max_miller",
               "kevin_shiiba", "sharone_tobias", "lambert_torres", "sandip_trivedi", "eddie_washington"};

       shuffleArray(students);

       int maxNumberOfPartners = (int)(students.length/2);  // not happy with this method need a more elegant solution
       String[] partners = new String[maxNumberOfPartners];
       int counter = 0;

       for (int i = 0; i < students.length; i++)
       {
           if(counter==maxNumberOfPartners){
               counter = 0;
           }
           if (partners[counter]!=null){
                partners[counter] = partners[counter] + " - " + students[i];
           } else{
               partners[counter] = students[i];
           }

           counter++;
       }

       System.out.println("This week's code review team-ups are: " + Arrays.toString(partners));


   }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(String[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i >= 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }





}
