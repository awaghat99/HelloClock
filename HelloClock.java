import java.time.LocalTime;
import java.util.Scanner;

public class HelloClock {
    public static void main(String[] args)  {
        System.out.println("Welcome to hello clock!");

        LocalTime now = LocalTime.now();
        System.out.println("The current time is: " + now);


        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.nextLine();

        sc.close();

        System.out.println("Hello " + name + "! The time you joined was: " + now);



    }
}