import java.util.Scanner;

public class DrawVerticalLine {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();

        for(int i= 0; i< n; i++){
            System.out.print("*\n");
        }
    }
}

