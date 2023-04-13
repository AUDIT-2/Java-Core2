/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day30_WrapperClass2;

public class MaxValueExample {

    public static int maxValue(int[] arr){
       //int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minValue(int[] arr){
        //int min = arr[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    /*public static void minAndMaxValue(int[] arr){
        System.out.println("minAndMaxValue method");
        System.out.println("minValue(arr) = " + minValue(arr));
        System.out.println("maxValue(arr) = " + maxValue(arr));
    }*/
    public static int[] minAndMaxValue(int[] arr){
        System.out.println("minAndMaxValue method returns as an array.");
        int[] result = new int[2];

        result[0] = minValue(arr);
        result[1] = maxValue(arr);
      return result;
    }

    public static void main(String[] args) {
        int[] sayilar = {565768,230,-156,78,123,90,-23,56};
        int[] sayilar1 = {230,3456,78,12456,90,-23,56};
        int[] sayilar2 = {123,230,-156,78,123,90,-23,56};

        System.out.println("maxValue(sayilar) = " + maxValue(sayilar));

        System.out.println("minValue(sayilar) = " + minValue(sayilar));

        int[] minMaxArr =  minAndMaxValue(sayilar);

        for (int i = 0; i < minMaxArr.length; i++) {
            System.out.println("Value of Sayılar array is = " + minMaxArr[i]);
        }
        System.out.println("Min. value of of sayilar Array is = " + minMaxArr[0]);
        System.out.println("Max. value of of sayilar Array is = " + minMaxArr[1]);

        System.out.println();
        minMaxArr =  minAndMaxValue(sayilar1);
        System.out.println("Min. value of of sayilar Array is = " + minMaxArr[0]);
        System.out.println("Max. value of of sayilar Array is = " + minMaxArr[1]);

        System.out.println();
        minMaxArr =  minAndMaxValue(sayilar2);
        System.out.println("Min. value of of sayilar Array is = " + minMaxArr[0]);
        System.out.println("Max. value of of sayilar Array is = " + minMaxArr[1]);
    }
}
