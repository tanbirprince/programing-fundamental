package task1

import java.util.Scanner;

public class LibraryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter average books read per month (v): ");
        int v = scanner.nextInt();

        System.out.print("Enter average visitors per year (n): ");
        int n = scanner.nextInt();

        // বছরে একজন ভিজিটর গড়ে কতটি বই পড়েন (k)
        double k = (double) (v * 12) / n;

        System.out.println("Average books read per year by one visitor (k): " + k);
        
        scanner.close();
    }
}
