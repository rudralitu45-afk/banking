
import java.util.Scanner;

public class CbsePercentage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE CBSE PERCENTAGE MAKER");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("ENTER YOUR PHYSICS MARK:");
            int physics = scan.nextInt();
            System.out.println("ENTER YOUR ENGLISH MARK:");
            int english = scan.nextInt();
            System.out.println("ENTER YOUR CHEMISTRY MARK:");
            int chemistry = scan.nextInt();
            System.out.println("ENTER YOUR MATHEMATICS MARK:");
            int math = scan.nextInt();
            System.out.println("ENTER YOUR COMPUTER SCIENCE MARK:");
            int computer = scan.nextInt();
            float percentage = ((physics + english + chemistry + math + computer) / 500.0f) * 100;
            System.out.println("Percentage: " + percentage + "%");
            // good practice
        }
    }
}


