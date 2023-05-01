/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Magaza;

public class Product {
    private static int id;
    private String urunAdi;
    private double birimFiyati;
    private double miktar = 1;
    private double toplamFiyat;
    private String kategori;

    public Product(String urunAdi, double birimFiyati,double miktar, String kategori) {
        seturunAdi(urunAdi);
        setbirimFiyati(birimFiyati);
        setMiktar(miktar);
        setkategori(kategori);
        setToplamFiyat();
    }

    public static int getId() {
        return id;
    }

    public static void setId() {
        Product.id = id++;
    }

    public String geturunAdi() {
        return urunAdi;
    }

    public void seturunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getbirimFiyati() {
        return birimFiyati;
    }

    public void setbirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public String getkategori() {
        return kategori;
    }

    public void setkategori(String kategori) {
        this.kategori = kategori;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public double getMiktar() {
        return miktar;
    }

    public double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat() {
        this.toplamFiyat = birimFiyati * miktar;
    }

    @Override
    public String toString() {
        String str = String.format("  %-10s %7.2f     %3.2f   %7.2f    %-15s  %n" ,urunAdi,birimFiyati,miktar,getToplamFiyat(),kategori);
        return str;
    }
}
