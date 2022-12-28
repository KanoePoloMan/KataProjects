package PoiskFibbonachi;

import java.util.Arrays;

public class LowHigh {
    public static String highAndLow(String numbers) {

        String[]  arrStr = numbers.split(" ");
        int[] arr = new int[arrStr.length];

        for(int i = 0; i < arrStr.length; i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return String.valueOf(arr[arr.length - 1]) + " " + String.valueOf(arr[0]);
    }
}
