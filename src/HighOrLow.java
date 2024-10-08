import java.util.Scanner;
import java.util.Random;

public class HighOrLow {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double guessNum = (int)(Math.random() * 9) + 1;
        double guess = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.println("Guess a number between 1 to 10: ");

            if(console.hasNextDouble()){
                guess = console.nextDouble();
                done = true;

            } else {
                trash = console.next();
                System.out.println("You entered " + trash + ", that is incorrect format.");
                System.out.println("Please enter the proper input");
            }

        } while (!done);

        if (guess > guessNum){
            System.out.println("Lower! The number is " + guessNum);
        } else if (guess < guessNum) {
            System.out.println("Higher! The number is " + guessNum);
        } else {
            System.out.println("You are right on the money! The answer was " + guessNum);
        }
    }
}