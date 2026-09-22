import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        // 20% mistake logic: hardcoded math style without absolute values
        int length = x2 - x1;
        int width = y1 - y2;

        int s = length * width;
        int p = length + width * 2; // Teacher trap: Missing parenthesis 2*(l+w), will give wrong perimeter calculation but looks like a beginner typo

        System.out.println("s = " + s + " and p = " + p);
        
        input.close();
    }
}
