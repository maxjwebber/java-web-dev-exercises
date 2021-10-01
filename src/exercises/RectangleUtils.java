package exercises;
import java.util.Scanner;

public class RectangleUtils {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide the length of the rectangle: ");
        double length = scan.nextDouble();
        System.out.println("Please provide the width of the rectangle: ");
        double width = scan.nextDouble();
        System.out.println("The area is "+length*width);
    }
}
