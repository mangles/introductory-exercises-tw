import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to discover its Prime Factors: ");
        int n = reader.nextInt();
        generate(n);
    }

    private static void generate(int n) {
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            } else
                i++;
        }
    }
}
