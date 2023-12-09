package Day30_WrapperClass2;

public class WrapperClassesSumOfDigits {
    public static int sumofDigits(String str){
        int toplam = 0;
        String digits = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
               // System.out.println(str.charAt(i));
                digits += str.charAt(i) + " ";
                toplam += Integer.parseInt(Character.toString(str.charAt(i)));
              // toplam += Integer.parseInt(str.charAt(i) + ""); //.parseInt() metodu Parametre olarak String istediğinden +"" ekleyerek char tipini stringe çevirdik
            }
        }
        System.out.println("Digits in string : " + digits);
       return toplam;
    }

    public static void main(String[] args) {
        String str = "ıueh5uqh23q2kjbjnk5jnjn3";
        System.out.println("sumofDigits(str) = " + sumofDigits(str));
    }

}
