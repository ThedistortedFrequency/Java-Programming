/* Input in Java
next, nextLine, nextInt, nextByte, next Float, nextDouble, nextBoolean, nextShort, nextLong.

*/

import java.util.*;

public class inputInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine(); // nextLine: returns all text up to a line break.
        System.out.println(name);

        int number = in.nextInt();
        System.out.println(number);

        float num = in.nextFloat();
        System.out.println(num);

        in.close();

    }

}
