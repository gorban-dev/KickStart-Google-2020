import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        int count = 0;
        while (cases > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long answer1 = (b - 1) + (a + 1);
            long answer2 = (b - 1) + (b - c) + (a - c + 1);
            cases--;
            count++;
            if (answer1 < answer2) {
                System.out.println("Case #" + count + ": " + answer1);
            } else {
                System.out.println("Case #" + count + ": " + answer2);
            }
        }
    }
}
