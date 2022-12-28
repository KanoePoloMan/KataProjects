package PoiskFibbonachi;

public class Sum {
    public int GetSum(int a, int b) {
        int c;
        int summ = 0;
        if(a == b) return a;
        for(int i = b > a ? a : b; i <= (c = b > a ? b : a); i++){
            summ += i;
        }

        return summ;
    }
}
