import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        boolean done = false;
        String trash = "";




        do {
            System.out.println("Enter your width: ");

            if(console.hasNextDouble()){
                width = console.nextDouble();
                done = true;

            } else {
                trash = console.next();
                System.out.println("You entered " + trash + ", that is incorrect format.");
                System.out.println("Please enter the proper input");
            }

        } while (!done);

        done = false;

        do {
            System.out.println("Enter your height: ");

            if(console.hasNextDouble()){
                height = console.nextDouble();
                done = true;

            } else {
                trash = console.next();
                System.out.println("You entered " + trash + ", that is incorrect format.");
                System.out.println("Please enter the proper input");
            }

        } while (!done);

        area = width * height;
        perimeter = (width * 2) + (height * 2);

        System.out.println("Your area is " + area + " units squared and your perimeter is " + perimeter + " units.");
    }
}