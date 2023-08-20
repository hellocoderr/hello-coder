import java.util.*;

public class Solid_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a rows and columns: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        // Outer Loop-->Rows
        for (int i = 1; i <= a; i++) {
            // Inner Loop--> Columns
            for (int j = 1; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}