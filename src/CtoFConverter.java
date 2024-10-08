import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int cTemp = 0;
        int fTemp = 0;
        boolean done = false;
        String trash = "";




        do {
            System.out.println("Enter a temperature in Celsius to convert to Fahrenheit: ");

            if(console.hasNextInt()){
                cTemp = console.nextInt();
                done = true;

            } else {
                trash = console.next();
                System.out.println("You entered " + trash + ", that is incorrect format.");
                System.out.println("Please enter the proper input");
            }

        } while (!done);

        fTemp = (cTemp * 9/5) + 32;
        System.out.println("Your temperature of " + cTemp + " degrees in Celsius is " + fTemp + " degrees in Fahrenheit.");

    }
}