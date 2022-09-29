import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please type your name");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();


        System.out.println("your name is " + name);
       

        System.out.println("Please type your age ");
        int age = scan.nextInt();

        System.out.println("Your age is " + age);

        System.out.println("Type your age again, we want to calculate how many years you have left till you retire");
        int result = scan.nextInt();

        System.out.println("There is " + (67 - result ) +  " years left till you retire");

    }
}