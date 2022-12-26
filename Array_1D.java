import java.util.*;

public class Array_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int [] number = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + i + " : ");
            number[i] = sc.nextInt();
        }
        System.out.print("Enter the number want to search : ");
        int num = sc.nextInt();

        // output
        for (int i = 0; i < size; i++) {
            if(num == number[i])
            System.out.println("Number found at : "+ i);
        }
        sc.close();
    } // main
} // class
