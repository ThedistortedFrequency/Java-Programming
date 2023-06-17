/*Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
Means:  
Char a = ‘a’;
Short b = 50; 
a+b (a and b will be converted in integer)
*/

public class typepromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        System.out.println((int) b);
        System.out.println((int) a);

        System.out.println(b - a);
    }
}
