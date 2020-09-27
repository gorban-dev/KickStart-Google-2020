import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = scanner.nextInt();
        int count1 = 0;
        while (caseNumber > 0) {
            count1++;
            int pNumber = scanner.nextInt();
            int cashQ = scanner.nextInt();
            System.out.print("Case #" + count1 + ":");
            int[] listCash = new int[pNumber];
            int[] list = new int[pNumber];
            for (int i = 0; i < pNumber; i++) {
                listCash[i] = scanner.nextInt();
            }
            for (int i = 0; i < pNumber; i++) {
                int a = listCash[i] / cashQ;
                if (listCash[i] % cashQ != 0) {
                    a++;
                }
                list[i] = a;
            }
            Integer[] integers = new Integer[pNumber];
            for(int i = 0;i < pNumber;++i) integers[i] = i;
            Arrays.sort(integers, Comparator.comparingInt((Integer i) -> list[i]).thenComparingInt(i -> i));
            for (Integer n: integers) {
                System.out.print(" " + (n + 1));
            }

            System.out.println();
            caseNumber--;
        }
        scanner.close();


    }
}
