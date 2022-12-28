package PoiskFibbonachi;

public class Solution {
    static int stray(int[] numbers) {
        int flag = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int c = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = c;
                }
            }
        }
        return numbers[0] != numbers[1] ? numbers[0] : numbers[numbers.length - 1];
    }

}
