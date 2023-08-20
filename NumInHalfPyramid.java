public class NumInHalfPyramid {
    public static void main(String[] args) {
        int num = 5;

        // 01 Row-wise
        // Row =====>
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        // System.out.println("Row =====> ");
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // // 02
        // // Row Reverse =====>
        // // 5 5 5 5 5
        // // 4 4 4 4
        // // 3 3 3
        // // 2 2
        // // 1
        // System.out.println("Row Reverse =====>");
        // for (int i = num; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // // 02.1
        // // Row Reverse =====>
        // // 5 5 5 5 5
        // // 4 4 4 4
        // // 3 3 3
        // // 2 2
        // // 1
        // System.out.println("Row Reverse 2.1=====>");
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= num; j++) {
        // if ((i + j) <= 6) {
        // System.out.print(6 - i + " ");
        // }
        // }
        // System.out.println();
        // }

        // // 02 Little change in above program
        // // 5 4 3 2 1
        // // 5 4 3 2
        // // 5 4 3
        // // 5 4
        // // 5
        // System.out.println("Row Reverse 2.1=====>");
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= num; j++) {
        // if ((i + j) <= 6) {
        // System.out.print(6 - j + " ");
        // }
        // }
        // System.out.println();
        // }

        // // 03 Colomn-Wise
        // // 1
        // // 1 2
        // // 1 2 3
        // // 1 2 3 4
        // // 1 2 3 4 5
        // System.out.println("column =====>");
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // // 03.1
        // // 1
        // // 1 2
        // // 1 2 3
        // // 1 2 3 4
        // // 1 2 3 4 5
        // System.out.println("================>");
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= num; j++) {
        // if ((i - j) <= -1) {
        // System.out.print(" ");
        // } else {
        // System.out.print(j + " ");
        // }
        // }
        // System.out.println();
        // }
        // // Column Reverse =====>
        // // 1 2 3 4 5
        // // 1 2 3 4
        // // 1 2 3
        // // 1 2
        // // 1
        // System.out.println("Column Reverse =====>");
        // for (int i = num; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // // num
        // // 12345
        // // 1234
        // // 123
        // // 12
        // // 1
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= num; j++) {
        // if ((i + j) <= 6) {
        // System.out.print(j + " ");
        // }
        // }
        // System.out.println();
        // }

        // Diamond Pattern
        System.out.println("Diamond Pattern ======>");
        // 01
        int m = 3;
        int n = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j >= 4 && j - i <= 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Reversed Diamond Pattern =======>");
        // 02
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j - i >= 0 && i + j >= 6) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
