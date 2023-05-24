package Day48_Collection1;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Basic implementation of ArrayList without methods.
        //ArrayList internal(iç) implementasyonunda Array leri kullanır. İlk oluşturulduğunda belli bir default uzunlukta bir Array oluşturur..10 gibi
        //Daha sonra yeni eleman eklemek için eğer Array de yer kalmamışsa yeni bir geçici Array oluşturup mevcut Arrayeki verileri geçici(temp) Array e copyalar
        //Daha sonra mevcut Array in 2 katı büyüklükte aynı isimde yeni bir Array oluşturup temp Arraydeki eski verileri yeni Array e kopyalayarak dinamik bir yapı sağlar.
        int[] sayilarPrimitive = new int[3]; //Initial Array
        int size = sayilarPrimitive.length;

        sayilarPrimitive[0] = 1;
        sayilarPrimitive[1] = 35;
        sayilarPrimitive[2] = 5;

        System.out.println("sayilarPrimitive[0] = " + sayilarPrimitive[0]);

        int[] temp = sayilarPrimitive;//Temp Array which holds data of initial Array
        System.out.println("temp.length = " + temp.length);

        sayilarPrimitive = new int[size * 2]; //New Array

        System.out.println("sayilarPrimitive.length = " + sayilarPrimitive.length);
        //Copying data from temp Array to new Array
        for (int i = 0; i < temp.length; i++){
            sayilarPrimitive[i] = temp[i];
        }
        sayilarPrimitive[4] = 34;
        System.out.println("sayilarPrimitive[4] = " + sayilarPrimitive[4]);

        //ArrayList
        System.out.println("ArrayList...................");

        ArrayList<Integer> sayilarArrayList = new ArrayList<>();

        int xSayisi = 234;
        Integer ySayisi = xSayisi;//Boxing

        sayilarArrayList.add(xSayisi);
        sayilarArrayList.add(23);
        sayilarArrayList.add(132);
        sayilarArrayList.add(12);
        sayilarArrayList.add(1244);
        sayilarArrayList.add(12);
        sayilarArrayList.add(4412);
        sayilarArrayList.add(15);
        sayilarArrayList.add(12);
        sayilarArrayList.add(4);
        sayilarArrayList.add(142);

        System.out.println("ArrayList : " + sayilarArrayList);

        System.out.println("sayilarArrayList.get(3) = " + sayilarArrayList.get(3));
        sayilarArrayList.add(3,38);
        System.out.println("sayilarArrayList.get(3) = " + sayilarArrayList.get(3));

        for (Integer sayi:sayilarArrayList){
            System.out.println("sayi = " + sayi);
        }

        //Creating ArrayList without type
        ArrayList typlessArrayList = new ArrayList();

        typlessArrayList.add("Ahmet");
        typlessArrayList.add(123);
        typlessArrayList.add(345.567);
        typlessArrayList.add('A');
        typlessArrayList.add(34.56F);
        typlessArrayList.add(new ArrayListExample());

        for (Object obj:typlessArrayList){
            if(obj instanceof Integer){
              obj = ((Integer)obj) * 2;
                System.out.println(obj);
            }
            if (obj instanceof String){
              obj = ((String) obj).toUpperCase();
                System.out.println(obj);
            }
        }

    }
}
