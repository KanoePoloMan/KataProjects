package Application;

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int pol = 0;
        int summNeg = 0;

        if(input != null){
            if(input.length == 0) return new int[] {};
                } else {
            return new int[] {};
        }
        for(int i = 0; i < input.length; i++){
            if(input[i] == 0)continue;
            if(input[i] > 0) pol++;
            if(input[i] < 0)summNeg += input[i];
        }
        return new int[] {pol, summNeg};
    }
}
