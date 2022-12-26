import java.util.*;
public class Function {
    public static void printName(String x){
        System.out.println(x);
    }

    public static int sum (int a,int b){
        return a+b;
    }

    public static void factorial(int n){
        if (n<1){
            System.out.println("Invalid Input");
            return;
        }
        int fac = 1;
        for (int i = 1; i<=n ; i++){
            fac = fac * i;
        }
        System.out.println("The factorial of entered number is : "+ fac);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the name :");
        // String c = sc.nextLine();
        // printName(c);


        // System.out.print("Enter 1st Number : ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter 2nd Number : ");
        // int num2 = sc.nextInt();
        // System.out.println("Sum of 2 numbers is : "+sum(num1,num2));


        System.out.print("Enter the the number : ");
        int f = sc.nextInt();
        factorial(f);
        sc.close();
    } // main
} // class
