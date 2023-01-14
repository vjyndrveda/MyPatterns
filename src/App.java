public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        pattern16(5);
    }

    static void pattern16(int n) {
        for (int row = 0; row < n; row++) {

            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print("   " + number);
                number = number * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int spacePrint = row >= n ? row - n + 1 : n - row + 1;
            int starPrint = row > n ? 2 * n - 2 * (row - n) - 1 : 2 * row - 1;
            for (int col = 1; col <= spacePrint; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= starPrint; col++) {
                if (col == 1 || col == starPrint) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                if (col == 1 || row == 1 || col == 2 * n - 2 * row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col < n; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || row == n || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int emptyColumns = row > n ? 2 * n - row : row - 1;
            int totalColumnsInRow = row > n ? row - n : n - row + 1;
            for (int col = 1; col <= emptyColumns; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            int emptyColumns = row - 1;
            int totalColumnsInRow = n - row + 1;
            for (int col = 1; col <= emptyColumns; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            int emptyColumns = n - row + 1;
            int totalColumnsInRow = row;
            for (int col = 1; col <= emptyColumns; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            int emptyColumns = row - 1;
            int totalColumnsInRow = 2 * n - 2 * row + 1;
            for (int col = 1; col <= emptyColumns; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int emptyColumns = n - row;
            int totalColumnsInRow = 2 * row - 1;
            for (int col = 1; col <= emptyColumns; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int emptyColumns = row - 1;
            int totalColumnsInRow = n - row + 1;
            for (int col = 1; col <= emptyColumns; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int emptyColumns = n - row;
            int totalColumnsInRow = row;
            for (int col = 1; col <= emptyColumns; col++) {
                System.out.print(" ");
            }
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
