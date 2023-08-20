public class Alphabet_Reverse {
    public static void main(String[] args) {
        int num = 5;

        // 01 - Row-Wise Change
        System.out.println("Row-Wise Change ==> ");
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num; j++) {
                System.out.print((char) (64 + i) + " ");
            }
            System.out.println();
        }

        // 02 - Row-Wise Change
        System.out.println("Row-Wise Change ==> ");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print((char) (70 - i) + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        // 01 - Column-Wise Change
        System.out.println("Column-Wise Change ==> ");
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= 1; j--) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }

        // 02 - Column-Wise Change
        System.out.println("Column-Wise Change ==> ");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print((char) (70 - j) + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        // 01
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if ((i + j) <= 6) {
                    System.out.print((char) (70 - i) + " ");
                }
            }
            System.out.println();
        }

        // 02
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if ((i + j) <= 6) {
                    System.out.print((char) (70 - j) + " ");
                }
            }
            System.out.println();
        }

    }
}
