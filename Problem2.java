import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        
        System.out.print("Output: ");
        for (int i = 1; i <= 2*a; i=i+2) {
            
                System.out.print(i + " ");
            
        }
    }
}
