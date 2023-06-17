import java.util.Scanner;

public class typecast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float number = 99.999f;
        int number2 = (int) number; // type casting float value to intger.

        System.out.println(number2);
        in.close();
    }
}
