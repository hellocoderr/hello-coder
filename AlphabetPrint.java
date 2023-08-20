public class AlphabetPrint {
    public static void main(String[] args) {
        int num = 5;

        // 01 - Row-Wise Change
        System.out.println("Row-Wise Change ==> ");
        // OuterLoop
        for (int i = 1; i <= num; i++) {
            // InnerLoop
            for (int j = 1; j <= num; j++) {
                System.out.print((char) (64 + i) + " ");
            }
            System.out.println();
        }

        // 02 - Column-Wise Change
        System.out.println("Column-Wise Change ==> ");
        // OuterLoop
        for (int i = 1; i <= num; i++) {
            // InnerLoop
            for (int j = 1; j <= num; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }
    }
}
