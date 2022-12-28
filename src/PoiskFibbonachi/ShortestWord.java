package PoiskFibbonachi;

import java.util.Arrays;

public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int[] wordsLength = new int[words.length];

        int maxRow;
        for (int j = 0; j < words.length; j++) {
            maxRow = 0;
            if (maxRow < words[j].length()) {
                maxRow = words[j].length();
            }
            wordsLength[j] = maxRow;
        }
        for(int i = 0; i < wordsLength.length; i++){
            for(int j = i; j < wordsLength.length; j++){
                if(wordsLength[i] > wordsLength[j]){
                    int c = wordsLength[j];
                    wordsLength[j] = wordsLength[i];
                    wordsLength[i] = c;
                }
            }
        }
//        System.out.println(Arrays.toString(wordsLength));
        return wordsLength[0];
    }
}
