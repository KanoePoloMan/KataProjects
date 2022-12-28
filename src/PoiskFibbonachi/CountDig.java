package PoiskFibbonachi;

import java.util.Arrays;

public class CountDig {
    public static int nbDig(int n, int d) {
        int[] arr = new int[n + 1];
        int summ = 0;
        for(int i = 1; i < n + 1; i++){
            arr[i] = i * i;
            summ += arr[i];
        }
        int summTime = arr[arr.length - 1];
        int discharge = 0;
        while(summTime != 0){
            summTime = summTime / 10;
            discharge++;
        }
        int digits = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = (int) Math.pow(10, discharge); j > 0; j = j / 10){
                if(arr[i] % j == d || arr[i] / j == d) {
                    digits++;
                     j = 0;
                }
            }
        }
        System.out.printf(String.valueOf(digits));
        return digits;
    }
}
