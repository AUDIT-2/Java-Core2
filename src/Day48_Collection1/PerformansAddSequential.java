package Day48_Collection1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformansAddSequential {
    public static double percent(long a, long b) {
        double result = 0;
        result = a / (double) b;
        return result;
    }

    public static void main(String[] args) {
        //double veri tipini formatlı göstermek için bir Decimal formatter tanımladık
        DecimalFormat df;

        int numberOfElements = 20_000_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Adding data sequentially");
        System.out.println("------------------------");

        long baslangicZamaniArr = System.nanoTime();


        //Adding data sequentially to arrayList
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        long bitisZamaniArr = System.nanoTime();
        long sureArr = bitisZamaniArr - baslangicZamaniArr;

        df = new DecimalFormat("#,###");
        System.out.println("Adding " + df.format(numberOfElements)  +" elements-performance(ArrayList)   : " + sureArr + " nano seconds.");

        long baslangicZamaniLnk = System.nanoTime();

        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        long bitisZamaniLnk = System.nanoTime();
        long sureLnk = bitisZamaniLnk - baslangicZamaniLnk;
        System.out.println("Adding " + df.format(numberOfElements)  + " elements-performance(LinkedList)  : " + sureLnk + " nano seconds.");

        //% Hesaplama
        df = new DecimalFormat("###.#");
        if (sureArr < sureLnk) {
            System.out.println("ArrayList LinkedList'ten " + df.format(percent(sureLnk,sureArr)) + " kat daha hızlı.");
        } else System.out.println("LinkedList ArrayList'ten " + df.format(percent(sureArr,sureLnk)) + " kat daha hızlı.");

        System.out.println();
/*
        System.out.println("Reading data sequentially");
        baslangicZamani = System.nanoTime();
        for (int i = 0; i <100000; i++){
            arrayList.get(i);
        }
        bitisZamani = System.nanoTime();
        System.out.println("Reading performance(ArrayList) : " + (bitisZamani - baslangicZamani) + " nano seconds.");*/


       /* System.out.println("Reading data sequentially");
        baslangicZamani = System.nanoTime();
        for (int i = 0; i <100000; i++){
            linkedList.get(i);
        }
        bitisZamani = System.nanoTime();
        System.out.println("Reading performance(LinkedList) : " + (bitisZamani - baslangicZamani) + " nano seconds.");*/

        System.out.println("Adding data with index");
        System.out.println("----------------------");
        baslangicZamaniArr = System.nanoTime();
        int index = 10000;
        arrayList.add(index, 1000);
        arrayList.add(index, 10000);
        arrayList.add(index, 100000);
        arrayList.add(index, 1000000);
        bitisZamaniArr = System.nanoTime();
        sureArr = bitisZamaniArr - baslangicZamaniArr;
        System.out.println("Adding performance(ArrayList)   : " + sureArr + " nano seconds.");

        baslangicZamaniLnk = System.nanoTime();
        linkedList.add(index, 1000);
        linkedList.add(index, 10000);
        linkedList.add(index, 100000);
        linkedList.add(index, 1000000);
        bitisZamaniLnk = System.nanoTime();
        sureLnk = bitisZamaniLnk - baslangicZamaniLnk;
        System.out.println("Adding performance(LinkedList)  : " + sureLnk + " nano seconds.");

        if (sureArr < sureLnk) {
            System.out.println("ArrayList LinkedList'ten " + df.format(percent(sureLnk, sureArr)) + " kat daha hızlı.");
        } else System.out.println("LinkedList ArrayList'ten " + df.format(percent(sureArr, sureLnk)) + " kat daha hızlı.");

    }
}
