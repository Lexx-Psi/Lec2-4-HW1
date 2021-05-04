import java.util.Arrays;

public class StatsService {
    public static int amountSales(int[] resultMonth){
        int amount = 0;
        for(int a:resultMonth)
            amount += a;
        return amount;
    }

    public static int middleAmountSales(int[] resultMonth){
        int amount = 0;
        for(int a:resultMonth)
            amount += a;
        return amount/resultMonth.length;
    }

    public static int monthMaxSales(int[] resultMonth){
        int index = 0;
        int maxAmount = 0;
        for(int i=0;i<resultMonth.length;i++){
            if(resultMonth[i]>=maxAmount){
                maxAmount=resultMonth[i];
                index = i;
            }
        }
        int numberMonth = index+1;
        return numberMonth;
    }

    public static int monthMinSales(int[] resultMonth){
        int index = 0;
        int minAmount = resultMonth[0];
        for(int i=0;i<resultMonth.length;i++){
            if(resultMonth[i]<=minAmount){
                minAmount=resultMonth[i];
                index = i;
            }
        }
        int numberMonth = index+1;
        return numberMonth;
    }

    public static int quantityMonthUnderMid(int[] resultMonth){
        int quantityMonth = 0;
        int midAmountSales = middleAmountSales(resultMonth);
        for(int a:resultMonth){
            if(a<midAmountSales)
                quantityMonth += 1;
        }
        return quantityMonth;
    }

    public static int quantityMonthMoreMid(int[] resultMonth){
        int quantityMonth = 0;
        int midAmountSales = middleAmountSales(resultMonth);
        for(int a:resultMonth){
            if(a>midAmountSales)
                quantityMonth += 1;
        }
        return quantityMonth;
    }



}
