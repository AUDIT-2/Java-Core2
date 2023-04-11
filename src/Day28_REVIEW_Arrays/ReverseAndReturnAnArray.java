package Day28_REVIEW_Arrays;

import java.util.Arrays;

public class ReverseAndReturnAnArray {
    public static boolean isPalindrome(int[] dizi){
      //Odev

        return true;
    }
    public static int[] reverseIntArray(int[] arr, int start, int end) {
        //4.Yöntem Recursive method
        if (start >= end) {
            return arr;
        }
        // İlk ve son elemanlarını yer değiştirme
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Metodu recursive olarak sonraki indeksteki elemanlarla tekrar çağırma
       return reverseIntArray(arr, start+1, end-1);
    }

    public static int[] reverseIntArray(int[] sayilar){
        int[] sonuc = new int[sayilar.length];
     /*sonuc[5] = sayilar[0];
        sonuc[4] = sayilar[1];
        sonuc[3] = sayilar[2];
        sonuc[2] = sayilar[3];
        sonuc[1] = sayilar[4];
        sonuc[0] = sayilar[5];*/

       //1.Yöntem
        int j = sonuc.length-1;
        // j değişkeni for dışında tanımlanıp for loop içerisinde eksiltilebilir
        for (int i = 0; i < sayilar.length; i++) {
            sonuc[j] = sayilar[i];
            j--;
        }

        //2.Yöntem
        //k değişkeni tanımlama ve eksiltme for loop () içerisinde yapılabilir
        for (int i = 0, k = sonuc.length-1; i < sayilar.length; i++, k--) {
                sonuc[k] = sayilar[i];
        }

        //3.Yöntem
        for (int i = 0; i < sayilar.length; i++) {
            sonuc[sonuc.length-1-i] = sayilar[i];
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int[] tamSayilar = {1,2,1,6};
        System.out.println("Arrays.toString(tamSayilar) = " + Arrays.toString(tamSayilar));
        System.out.println("Arrays.toString(reverseIntArray(tamSayilar)) = " + Arrays.toString(reverseIntArray(tamSayilar)));

        for (int sayi: reverseIntArray(tamSayilar)) {
            System.out.print(sayi + " ");
        }

        System.out.println();

        //RECURSIVE METHOD CALLED
        int[] reverseArray = reverseIntArray(tamSayilar,0, tamSayilar.length-1);
        System.out.println("Recursive metod ile diziyi tersine çevirme");
        for (int sayi: reverseArray){
            System.out.print(sayi + " ");
        }
        System.out.println();

        if ( Arrays.equals(tamSayilar,reverseIntArray(tamSayilar))){
            System.out.println("Palindromedur.");
        } else System.out.println("Palindrome değildir");

    }
}
