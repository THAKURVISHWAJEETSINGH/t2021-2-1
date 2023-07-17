import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        scanner.close();

        String output = generateOddNumbers(input);
        System.out.println(output);
    }

    public static String generateOddNumbers(int num) {
        if (num % 2 == 0) {
            num -= 1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 2*num; i += 2) {
            result.append(i).append(" ");
        }

        return result.toString().trim();
    }
}
