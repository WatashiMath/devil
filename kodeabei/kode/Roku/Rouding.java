import java.util.Scanner;
// Crossing Field - Lisa

public class Rouding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < cases; i++) {
            String[] pair = scanner.nextLine().split(" ");
            double numerator = Double.parseDouble(pair[0]);
            double denominator = Double.parseDouble(pair[1]);

            int result = divideAndRound(numerator, denominator);
            System.out.print(result + " ");
        }

        scanner.close();
    }

    private static int divideAndRound(double numerator, double denominator) {
        double result = numerator / denominator;
        return (int) Math.round(result);
    }
}
