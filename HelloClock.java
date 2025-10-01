import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class HelloClock {
    public static void main(String[] args)  {
        System.out.println("Welcome to hello clock!");

        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String cleanTime = now.format(formatter);
        System.out.println("The current time is: " + cleanTime);



        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.nextLine();

        sc.close();

        System.out.println("Hello " + name + "! The time you joined was: " + cleanTime);



    }
}