package PoiskFibbonachi;

import java.util.Arrays;

public class DnaStrand {
    public static String makeComplement(String dna) {
            char[] arr = dna.toCharArray();
            String returned = null;
            boolean flag = false;
            for(int i = 0; i < arr.length; i++){
                flag = false;
                if(arr[i] == 'T' && flag == false) {
                    arr[i] = 'A';
                    flag = true;
                }
                if(arr[i] == 'A' && flag == false) {
                    arr[i] = 'T';
                    flag = true;
                }
                if(arr[i] == 'C' && flag == false) {
                    arr[i] = 'G';
                    flag = true;
                }
                if(arr[i] == 'G' && flag == false) {
                    arr[i] = 'C';
                    flag = true;
                }
                returned += arr[i];
            }
        return new String(arr);
    }
}
