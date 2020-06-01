import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
            long numberTest = scanner.nextLong();
            long countCase = 0;
            while (numberTest > 0) {
                countCase++;
                int test = scanner.nextInt();
                ArrayList<Long> housesNumber = new ArrayList<>(test);
                long budget = scanner.nextLong();
                while (test > 0) {
                    housesNumber.add(scanner.nextLong());
                    test--;
                }
                Collections.sort(housesNumber);
                long tmp = 0;
                long countHouses = 0;
                for (int i = 0; i < housesNumber.size(); i++) {
                    tmp += housesNumber.get(i);
                    if (tmp <= budget) {
                        countHouses++;
                    }
                }
                numberTest--;
                System.out.println("Case #" + countCase + ": " + countHouses);
            }
        } catch (Exception e) {
            e.getStackTrace();

        }

    }
}



