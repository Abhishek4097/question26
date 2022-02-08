import java.util.Scanner;

public class DiffPattern {
    public static void main(String[] args) {
        //upper half of the pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n); j++) {
                if (i >= j)//upper left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if (i >= (2 * n - 1) - j)//upper right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //bottom half of the pattern
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < (2 * n); j++) {
                if (i + j <= n - 1)//bottom left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if ((i + n) <= j)//bottom right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
