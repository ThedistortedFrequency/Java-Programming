// byte -> short -> int -> float -> long -> double.

import java.util.Scanner;

public class typecoversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int number = in.nextFloat(); it is not possible in java
        float number = in.nextInt();
        System.out.println(number); // its possible integer ko float mein assign kar sakte hai.

        in.close();

    }
}
