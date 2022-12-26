
// Name :- Vinayak Gharge
// Topic :- Pattern Problems
// Date :- 01/10/22



// import java.util.*;
class Pattern {
    public static void main(String args[]) {
        // System.out.print("Enter the value of Rows : ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int num = 1; // for printing Floyed's Triangle (pattern-8)
        System.out.println();


        System.out.println("Pattern - 1");
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 2");
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 3");
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 4");
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 5");
        //     *
        //    **
        //   ***
        //  ****
        // *****
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<=n-i; j++){
                 System.out.print(" ");
            }// end for of j
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 6");
        // 1
        // 12
        // 123
        // 1234
        // 12345
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 7");
        // 12345
        // 1234
        // 123
        // 12
        // 1
        for (int i = n; i >= 1; i--){
            for ( int j = 1; j <= i; j++){
                System.out.print(j);
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 8");
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 9");
        // 1
        // 01
        // 101
        // 0101
        // 10101
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0)
                System.out.print("1");
                else
                System.out.print("0");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 10");
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // end for of j
            for(int j = 1; j <= (n-i)*2;j++){
                System.out.print(" ");
            } // end for of j
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // end for of j
            for(int j = 1; j <= (n-i)*2;j++){
                System.out.print(" ");
            } // end for of j
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 11");
        //     *****
        //    *****
        //   *****
        //  *****
        // *****
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }// end for of j
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 12");
        //     *****
        //    *   *
        //   *   *
        //  *   *
        // *****
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }// end for of j
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 13");
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            } // end for of j
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 14");
        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            } // end for of j
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            } // end for of j
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            } // end for of j
            System.out.println();
        } // end for of i
        System.out.println();


        System.out.println("Pattern - 15");
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            } // end for of j
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            } // end for of j
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            } // end for of j
            System.out.println();
        } // end for of i
        
    }
}
