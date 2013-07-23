import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/15/13
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestHarness {

    public static void main(String... args){

        boolean notQuit = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType 'list' or 'stack' to start:");
        String result = scanner.next();

        if(result.equals("list")){
            createList();
        }else{
            createStack();
        }
    }

    public static void createList(){

        IntLinkedList queue = new IntLinkedList();


        Scanner scanner = new Scanner(System.in);

        //wrap in while loop
        System.out.println("enter add something");
        String next = scanner.next();
        String[] input = next.split(" ");
        int value = Integer.valueOf(input[1]);
        queue.insert(value);
        queue.print();

    }

    public static void createStack(){
        IntStack stack = new IntStack();
        Scanner scanner = new Scanner(System.in);

        //wrap in while loop
        System.out.println("enter push|pop|size something");
        String next = scanner.next();
        //parse out command and data

        //
        //print

    }




    }

}
