public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        pattern5(5);
    }

    static void pattern6(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColumnsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColumnsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
