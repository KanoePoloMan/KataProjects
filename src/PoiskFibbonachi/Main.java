package PoiskFibbonachi;

import javax.naming.ldap.SortKey;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        //int[] sequence = new int[] {-2, 0, 3, 5, 7, 9, 11, 15, 18, 21};
        //int element = 18;

        //FibonacciSearch fs = new FibonacciSearch();

        //int index = fs.search(sequence, element);

        //System.out.println(index);

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        list.add(new int[] {2,5});
        list.add(new int[] {5,5});
        System.out.println(Metro.countPassengers(list));
    }
}
