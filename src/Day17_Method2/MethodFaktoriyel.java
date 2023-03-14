package Day17_Method2;

public class MethodFaktoriyel {
    public static void ekranaYaz(String yaz){
        System.out.println("* "+ yaz);
    }
    public static int faktoriyelHesapla(int sayi){
        int faktoriyel = 1;
        while (sayi > 0){
            faktoriyel *= sayi; //faktoriyel = faktoriyel * sayi;
            sayi--;
        }
        return faktoriyel;
    }
    public static void main(String[] args) {
        System.out.println("faktoriyelHesapla(3) = " + faktoriyelHesapla(3));
        System.out.println("faktoriyelHesapla(10) = " + faktoriyelHesapla(10));

        int fktryl = faktoriyelHesapla(8);
        System.out.println("fktryl = " + fktryl);

        ekranaYaz("Faktoriyel =  "+ fktryl);
        ekranaYaz("Merhaba java");
        ekranaYaz("Toplam = " + (23+56));
    }
}
