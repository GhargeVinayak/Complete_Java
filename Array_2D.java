import java.util.Scanner;

class Array_2D {
    public static void main(String[] args) {
        int size = 3;
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[size][size];
        int[][] mat2 = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter Element (" + (i + 1) + "," + (j + 1) + ") of Matrix 1 : ");
                mat1[i][j] = sc.nextInt();
            } // for j
        } // for i
        System.out.println("************************************************");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter Element (" + (i + 1) + "," + (j + 1) + ") of Matrix 2 : ");
                mat2[i][j] = sc.nextInt();
            } // for j
        } // for i
        System.out.println("************************************************");
        System.out.println("Sum of Matrix 1 and Matrix 2 is :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((mat1[i][j] + mat2[i][j]) + " ");
            } // for j
            System.out.println();
        } // for i
    sc.close();
    } // main
} // Array_2D