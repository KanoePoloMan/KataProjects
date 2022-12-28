package PoiskFibbonachi;

public class Kata {
    public static boolean solution(String str, String ending) {

        char[] equal = str.toCharArray();
        char[] end = ending.toCharArray();

        int difference = equal.length - end.length;
        if (difference < 0) return false;
        int endFlag = end.length;
        int flag = 0;

        for (int i = difference; i < equal.length; i++) {
            if (equal[i] == end[i - difference]) flag++;
        }
        return flag == endFlag;

    }
}
