public class SerialNum {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Row-Wise Changing ===> ");
        // OuterLoop
        for (int i = 1; i <= num; i++) {
            // InnerLoop
            for (int j = 1; j <= num; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Column-Wise Changing ===> ");
        // OuterLoop
        for (int i = 1; i <= num; i++) {
            // InnerLoop
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
