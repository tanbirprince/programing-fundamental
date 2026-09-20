package task2;

import java.util.Scanner;

public class TilesCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter room length (integer): ");
        int length = scanner.nextInt();

        System.out.print("Enter room width (integer): ");
        int width = scanner.nextInt();

        System.out.print("Enter price per square unit (floating-point): ");
        double price = scanner.nextDouble();

        int area = length * width;
        double totalCost = area * 1.05 * price;

        System.out.println("Total floor area: " + area);
        System.out.println("Total money required: " + totalCost);

        scanner.close();
    }
}
