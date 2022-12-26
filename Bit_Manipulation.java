public class Bit_Manipulation {
    public static void main(String[] args) {

        
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1<<pos; // 0100

        // Get Bit()
        if ((bitMask & n) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("Bit was one");
        }

        // Set Bit()
        int newNo = bitMask | n;
        System.out.println(newNo);

        // Cleat Bit()
        int notBitMask = ~(bitMask);
        newNo = notBitMask & n;
        System.out.println(newNo);

        // Update Bit()
        // to convert 1 -> 0  use Clear Bit()
        // to convert 0 -> 1  use Set Bit()
    }
}
