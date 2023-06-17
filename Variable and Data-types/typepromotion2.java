/*
 If one operand is long, float or double the whole expression is prompted to long, float or double respectively
 */

public class typepromotion2 {
    public static void main(String[] args) {
        int a = 20;
        float b = 20.74f;
        long c = 35;
        double d = 98;
        double ams = a + b + c + d;
        System.out.println(ams);

    }
}
