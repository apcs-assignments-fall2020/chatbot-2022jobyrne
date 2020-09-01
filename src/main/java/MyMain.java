import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = scan.next();
        System.out.println("Hello " + name + ", nice to meet you!");
        System.out.print("What is your favorite colour?");
        String colour = scan.next();
        System.out.println("I love " + colour + " too!");
        System.out.print("What is your favorite animal?");
        String animal = scan.next();
        System.out.println(animal + "'s are so cute!");
        System.out.print("What school do you go to?");
        String school = scan.next();
        System.out.println("I go to " + school + " too" );
        System.out.print("What is your favorite season?");
        String season = scan.next();
        System.out.println("Fun! My favorite season is " + season + " too!");

        scan.close();
    }
}
