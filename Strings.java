// import java.*;
// Strings are immutable.
public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // String name = "Vinayak";
        // System.out.println(name);
        // String name = sc.nextLine();
        // System.out.println(name);
        
        // String name1 = "Vinayak";
        // String name2 = "Vinayak";
        /* name1.compare(name2) 
           if name1 > name2 returns +ve value 
           if name1 == name2 returns 0
           if name1 < name2 returns -ve value */ 
        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // } else {                                                     // Strings are equal
        //     System.out.println("Strings are not equal");
        // }

        // if (name1 == name2) {
        //     System.out.println("Strings are equal");
        // } else {                                                     // Strings are equal
        //     System.out.println("Strings are not equal");
        // }

        // if (new String("Vinayak")==new String("Vinayak")) {
        //     System.out.println("Strings are equal");
        // } else {                                                     // Strings are not equal
        //     System.out.println("Strings are not equal");
        // }
            
        // // substring(beg index, end index+1)
        //     String sentence = "My name is Vinayak";
            
        //     String name3 = sentence.substring(11,sentence.length());
        //     String name4 = sentence.substring(0,8);
        //     System.out.println(name3);
        //     System.out.println(name4);

            /*        String Functions         */

            StringBuilder sb = new StringBuilder("Vinayak");
            System.out.println(sb);

            // displays char at index 0 
            System.out.println(sb.charAt(0));

            // Replace char at index 0
            sb.setCharAt(0, 'J');
            System.out.println(sb);

            // insert char at index 0
            sb.insert(0, 'A');
            System.out.println(sb);

            // delete char from 0 to 2. (2 in excluded)
            sb.delete(0, 2);
            System.out.println(sb);

            // append - add char at end
            sb.append("s");
            System.out.println(sb);

            // prints the lenght
            System.out.println(sb.length());

            // Reverse the String
            for(int i = 0; i<sb.length()/2; i++)
            {
                int front = i;
                int back = sb.length()-1-i;

                char frontChar = sb.charAt(front);
                char backChar = sb.charAt(back);

                sb.setCharAt(front, backChar);
                sb.setCharAt(back, frontChar);
            }
            System.out.println(sb);

    } // main
} // class
