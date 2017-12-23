import java.util.Scanner;

public class IsoscelesTriangle {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
                System.out.print(" ");

            for(int j=0;j<=(2*i);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

