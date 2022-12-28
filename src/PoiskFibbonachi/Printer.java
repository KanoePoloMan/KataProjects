package PoiskFibbonachi;

public class Printer {

    public static String printerError(String s) {

        char[] charS = s.toCharArray();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        int symbols = s.length();
        int errors = 0;
        int flag = 0;

        for(int i = 0; i < symbols + 1; i++){
            if(flag != i){
                errors++;
                flag = i;
            }
            if(i < symbols) {
                for (int j = 0; j < letters.length; j++) {
                    if (charS[i] == letters[j]) {
                        flag++;
                    }
                }
            }
        }
        return errors + "/" + symbols;
    }
}
