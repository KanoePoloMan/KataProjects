package PoiskFibbonachi;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        double difference = (desired - principal);
        double principalLoc = principal;
        int years = 0;

        for(int i = 0; desired - principalLoc > 0; years++){
            principalLoc += principalLoc * interest - principalLoc * interest * tax;
        }

        System.out.println(years);
        return years;
    }
}//1000,0.05,0.18,1100