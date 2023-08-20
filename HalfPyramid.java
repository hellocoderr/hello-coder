//import java.util.*;

public class HalfPyramid {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        System.out.println("Enter a rows and columns: ");
        // int n = scan.nextInt();
        int n = 5;
        // scan.close();

        // // Right-side Correct Pyramid ======>
        // // *
        // // * *
        // // * * *
        // // * * * *

        // // 01
        // System.out.println("Right-side Correct Pyramid ======>");
        // // OuterLoop
        // for (int i = 1; i <= n; i++) {
        // // InnerLoop
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // 02
        // // Right-side Reverse Pyramid ======>
        // // * * * *
        // // * * *
        // // * *
        // // *
        // System.out.println("Right-side Reverse Pyramid ======>");
        // // OuterLoop
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // or 02
        // // Right-side Reverse Pyramid ======>
        // // * * * *
        // // * * *
        // // * *
        // // *
        // System.out.println("Right-side Reverse Pyramid ======>");
        // // OuterLoop
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // or 03
        // // Right-side Reverse Pyramid ======>
        // // * * * *
        // // * * *
        // // * *
        // // *
        // System.out.println(" Right-side Reverse Pyramid ======>");
        // // OuterLoop
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // if (i == j || i <= j) {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i + j <= 6) {
                    System.out.print("* ");
                } else {
                    System.out.print(""); // By giving space it's Output will changes
                }
            }
            System.out.println();
        }
    }
}
