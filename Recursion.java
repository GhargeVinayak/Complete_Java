// Here I will know the basics of recursion 
class Recursion {
    public static void printNum5_1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum5_1(n - 1);
    }

    public static void printNum1_5(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNum1_5(n + 1);
    }

    public static void printSum(int i, int sum, int n) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, sum, n);
        // the statement below the recursive function is executed when the reture
        // statement is executed
        System.out.println(i);
    }

    public static int calcFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int nm1 = calcFactorial(n - 1);
        int fac = n * nm1;
        return fac;
    }

    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.err.println(c);
        printFib(b, c, n - 1);
    }

    public static int calcPower1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpow_nm1 = calcPower1(x, n - 1);
        int xpow = x * xpow_nm1;
        return xpow;
    }

    public static int calcPower2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            return calcPower2(x, n / 2) * calcPower2(x, n / 2);
        }
        // if n is odd
        else {
            return calcPower2(x, n / 2) * calcPower2(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        // // Print num from 5 to 1
        // int num = 5;
        // printNum5_1(num);

        // // Print num froom 1 to 5
        // int num = 1;
        // printNum1_5(num);

        // // Print sum of first n natural numbers
        // int n = 5;
        // printSum(1, 0, n);

        // // Print the factorial of number n
        // int n = 5;
        // int ans = calcFactorial(n);
        // System.out.println(ans);

        // // Print the fibonacci sequence till nth term
        // int n = 10;
        // int a = 0, b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // printFib(a, b, n);

        // // Print x^n (stack height = n)
        // int x = 2, n = 5;
        // int ans = calcPower1(x, n);
        // System.out.println(ans);

        // // Print x^n (stack height = logn)
        // int x = 2, n = 5;
        // int ans = calcPower2(x, n);
        // System.out.println(ans);
    }
}