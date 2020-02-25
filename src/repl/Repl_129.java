package repl;

import java.util.Arrays;

public class Repl_129 {
    public static void main(String[] args) {

        String[] numbers = {"zero", "one", "two", "three", "four"};
        int counterContainsE = 0;
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x].contains("e")) {
                counterContainsE++;
            }
        }
        String[] fewValues = new String[counterContainsE];
        int fewValuesIndex = 0;
        for (int x = 0; x < numbers.length; x++) {

            if (numbers[x].contains("e")) {
                fewValues[fewValuesIndex] = numbers[x];
                fewValuesIndex++;
            }
        }
        System.out.println(Arrays.toString(fewValues));
    }
}






