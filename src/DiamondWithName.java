import java.util.Scanner;

public class DiamondWithName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        upperPart(n);
        System.out.print("Mireia");
        System.out.println("");

        lowerPart(n);


    }

    private static void upperPart(int n){
        for(int i=0;i<n-1;i++)
        {
            for(int j=0; j<n-i; j++)
                System.out.print(" ");

            for(int j=0; j<=(2*i); j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    private static void lowerPart(int n) {

        for (int i = 0; i<n-1; i++) {
            for (int j=0; j<=i+1; j++)
                System.out.print(" ");

            for (int j=0; j<=(2*(n-i-2)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

