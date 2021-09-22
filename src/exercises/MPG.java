package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = scan.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        double gals = scan.nextDouble();
        System.out.println("Your car gets "+miles/gals+" miles per gallon.");
    }
}
