public class ReverseNum {
    public static void main(String[] args) {
        int num = 5;

        // 01
        // Row-Wise Changing ===>
        // 5 5 5 5 5
        // 4 4 4 4 4
        // 3 3 3 3 3
        // 2 2 2 2 2
        // 1 1 1 1 1
        System.out.println("Row-Wise Changing ===> ");
        // OuterLoop
        for (int i = num; i >= 1; i--) {
            // InnerLoop
            for (int j = 1; j <= num; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // 02
        // Column-Wise Changing ===>
        // 5 4 3 2 1
        // 5 4 3 2 1
        // 5 4 3 2 1
        // 5 4 3 2 1
        // 5 4 3 2 1
        System.out.println("Column-Wise Changing ===> ");
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
