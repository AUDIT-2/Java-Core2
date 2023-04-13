package Day30_WrapperClass2;

public class WrapperClassesSumOfDigits {
    public static int sumofDigits(String str){
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
               // System.out.println(str.charAt(i));
                toplam += Integer.parseInt(Character.toString(str.charAt(i)));
              // toplam += Integer.parseInt(str.charAt(i) + ""); //.parseInt() metodu Parametre olarak String istediğinden +"" ekleyerek char tipini stringe çevirdik
            }
        }
       return toplam;
    }

    public static void main(String[] args) {
        String str = "ıueh5uqhq2kjbjnk5jnjn3";
        System.out.println("sumofDigits(str) = " + sumofDigits(str));
    }

}
