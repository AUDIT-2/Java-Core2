package Day30_WrapperClass2;

public class WrapperClassTask_UpdateDigits {
    public static String updateDigits(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                result += str.charAt(i) + ",";
            }
        }
        result = result.substring(0,result.length()-1);//Return edilecek string teki en son ',' atmak için
        return result;
    }

    public static void main(String[] args) {
        String str = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";

        System.out.println("updateDigits(str) = " + updateDigits(str));

    }
}
