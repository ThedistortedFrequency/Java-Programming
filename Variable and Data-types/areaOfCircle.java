import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rad = in.nextFloat();
        float area = 3.14f * rad * rad; // f: convert double to float value.
        System.out.println(area);

        in.close();

    }
}
