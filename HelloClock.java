import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class HelloClock {
    public static void main(String[] args)  {
        System.out.println("Welcome to hello clock!");

        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String cleanTime = now.format(formatter);
        System.out.println("The current time is: " + cleanTime);



        Scanner sc = new Scanner(System.in);
        String name = "";

        while (!name.equals("exit")) {
            System.out.println("What is your name: ");
            name = sc.nextLine();
            LocalTime timeForPerson = LocalTime.now();
            cleanTime = timeForPerson.format(formatter); 
            if (!name.equals("exit")) {
                System.out.println("Hello " + name + "! The time you joined was: " + cleanTime);
            }
            
            
        }
        

        sc.close();

        



    }
}