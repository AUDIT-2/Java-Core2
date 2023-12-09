package Day30_WrapperClass2;

public class ValueOf {
    public static void main(String[] args) {
        String sayiStrInt = "1234";
        String sayiStrDbl = "3.14";

        int sayiInt = Integer.valueOf(sayiStrInt);
        double sayiDbl = Double.valueOf(sayiStrDbl);

        System.out.println("sayiInt = " + sayiInt);
        System.out.println("sayiInt = " + (sayiInt * 2));
        System.out.println("sayiDbl = " + sayiDbl);

        Integer number = new Integer(1234); //Deprecated for removal
        String numberStr = String.valueOf(number); //Convert Integer to String

        String numberStr2 = number.toString();
        System.out.println("numberStr = " + numberStr);
        System.out.println("numberStr2 = " + numberStr2);
    }
}
