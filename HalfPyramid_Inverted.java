public class HalfPyramid_Inverted {
    public static void main(String[] args) {
        int num = 5;
        // 01 type
        for (int i = 1; i <= num; i++) {
            // InnerLoop for ===> SPACES
            for (int j = 1; j <= num; j++) {
                if (j <= num - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 02 type
        for (int i = 1; i <= num; i++) {
            // InnerLoop for ===> SPACES
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // InnerLoop for ===> STARS
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // just by giving a space it makes triangle(if u want try withut spaces)
            }
            System.out.println();
        }

        // 03
        // ---*
        // --**
        // -***
        // ****
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if ((i + j) <= 6) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
