package PoiskFibbonachi;

import java.util.ArrayList;

public class Metro {
    static boolean flag = false;
    static int arrCounter;
    public static int countPassengers(ArrayList<int[]> stops) {
        try{
            for(arrCounter = 0; !flag; arrCounter++){
                stops.get(arrCounter);
            }
        } catch (IndexOutOfBoundsException e){
            flag = true;
        }
        short index = 0;
        int allPassengers = 0, outPassengers = 0;
        int[][] summOfPassengers = new int[arrCounter][];
        for(int i = 0; i < arrCounter; i++, index++){
            summOfPassengers[index] = stops.get(i);
        }
        for(int i = 0; i < summOfPassengers.length; i++){
            allPassengers += summOfPassengers[i][0];
            outPassengers += summOfPassengers[i][1];
        }
        return allPassengers - outPassengers;
    }
}
