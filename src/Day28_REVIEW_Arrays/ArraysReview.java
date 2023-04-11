package Day28_REVIEW_Arrays;

public class ArraysReview {

    public static void main(String[] args) {
        System.out.println("Review of Arrays in Java.");

        //Declaration
        // dataType[] arrayRefVar;  preferred way.

        //Creating an Array
        int[] sayilar; // java hafızada bir dizi nesnesi oluşturmaz
        sayilar = new int[5]; // java new anahtar kelimesi ile hafizada belirlenen büyüklükte bir dizi nesnesi oluşturur.
        int[] numbers = new int[3]; //{0,0,0} Default values of int data type

        //Assignment
        int[] tamSayilar = {2,4,5,6}; //Literal--doğrudan veri atayarak tanımlama
        sayilar = new int[]{1,2,3,4,5};
        numbers[0] = 34;
        numbers[2] = 12;

        //Accessing the elements of an Array
        System.out.println("numbers[1] = " + numbers[1]); // value is 0
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("tamSayilar[3] = " + tamSayilar[3]); //3 indexteki elemanı

        //Changing the elements of an Array
        numbers[1] = 123; // value is 123
        System.out.println("numbers[1] = " + numbers[1]);

        //Traversing
        //For .. loop
        System.out.println();
        System.out.println("Traversing an array with for loop");
        for (int i = 0; i < 4; i++) {
            System.out.println("tamSayilar[i] = " + tamSayilar[i]);
        }
        System.out.println("-----------------");
        System.out.println("Tamsayılar dizisini eleman sayısı = " + tamSayilar.length);
        for (int i = 0; i < tamSayilar.length; i++) {
            System.out.println("tamSayilar[" + i +"] = "  + tamSayilar[i]);
        }
        System.out.println("----------------------------");
        //For each --- advanced for loop or modern for loop
        for (int eleman : tamSayilar) {
            System.out.println("Eleman = " + eleman);
        }

        System.out.println("----------------------------");
        int index = 0;
        for (int eleman : tamSayilar) {
            System.out.println("Eleman[" + index +"] = " + eleman);
            index++;
        }
        System.out.println("----------------------------");
        for (int eleman : tamSayilar) {
            System.out.println("Eleman * 2 = " + (eleman * 2));
        }

        index = 0;
        for (int eleman : tamSayilar) {
            System.out.println("Eleman[" + index +"] = " + eleman);
            index++;
        }
        System.out.println("----------------------------");
        String[] isimler = {"Ahmet","Mehmet","Fatma"};

        for (String isim : isimler) {
            System.out.println("isim = " + isim);
        }

    }
}
