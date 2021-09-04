package com.company;

import java.util.Arrays;

public class Main {

    

    public static void main(String[] args) {
        double[] numbers={-1.1, 2.2, -3.3, -4.4, 5.5, 6.6, -7.7, 8.8, 9.9, -10.1, 11.2, 12.3, -16.98, 14.1, 15.456
        };
        double sum =0;
      //  boolean isFacedNegative= true;
      //  double avarageSum;
        int counter=0;

        for (double myNumbers:numbers) {
//            if (myNumbers<0){
//                isFacedNegative=false;
//
//            }
             if (myNumbers>0){
                sum+=myNumbers;
                counter++;
            }
        }
        System.out.println(Arrays.deepToString(new double[][]{numbers})+"="+sum / counter);
    }
}
