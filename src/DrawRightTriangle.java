import java.util.Scanner;

public class DrawRightTriangle {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

