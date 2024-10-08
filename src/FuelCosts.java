import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double maxTank = 0;
        double milesPG = 0;
        double costPG = 0;
        double costFor100 = 0;
        double fullDistance = 0;
        boolean done = false;
        String trash = "";




        do {
            System.out.println("Enter how many gallons can your tank hold: ");

            if(console.hasNextDouble()){
                maxTank = console.nextDouble();
                done = true;

            } else {
                trash = console.next();
                System.out.println("You entered " + trash + ", that is incorrect format.");
                System.out.println("Please enter the proper input");
            }

        } while (!done);

        done = false;

        do {
            System.out.println("Enter how many miles does your car gets per gallon: ");

            if(console.hasNextDouble()){
                milesPG = console.nextDouble();
                done = true;

            } else {
                trash = console.next();
                System.out.println("You entered " + trash + ", that is incorrect format.");
                System.out.println("Please enter the proper input");
            }

        } while (!done);

        done = false;

        do {
            System.out.println("Enter the price per gallon you pay for gas: ");

            if(console.hasNextDouble()){
                costPG = console.nextDouble();
                done = true;

            } else {
                trash = console.next();
                System.out.println("You entered " + trash + ", that is incorrect format.");
                System.out.println("Please enter the proper input");
            }

        } while (!done);

        costFor100 = (costPG / milesPG) * 100;
        fullDistance = maxTank * milesPG;

        System.out.println("Your cost to drive 100 miles would be $" + costFor100 + " and your max tank distance is " + fullDistance + " miles.");



    }
}