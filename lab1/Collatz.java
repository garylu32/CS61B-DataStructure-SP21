/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /**
     * nextNumber function return n/2 if input number n is even, else return 3n + 1
     * @param n - Integer, input number
     * @return - Integer,the nextNumber
     */
    public static int nextNumber(int n) {
        if (n % 2 != 0) {
            return n * 3 + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

