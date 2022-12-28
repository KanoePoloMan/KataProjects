package PoiskFibbonachi;

public class Codewars {

    public static String oddOrEven (int[] array) {
        int summ = 0;
        for(int i = 0; i < array.length; i++){
            summ += array[i];
        }
        return summ % 2 == 0 ? "even" : "odd";
    }
}
