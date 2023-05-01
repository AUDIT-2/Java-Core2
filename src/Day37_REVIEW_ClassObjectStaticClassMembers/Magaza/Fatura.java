/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Magaza;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {
    static private int id=0;
    static private int faturaNo;
    static private String firmaAdi;
    static private String firmaAdres;
    static private String webAdres;
    static private String mailAdres;
    static private String telNo;

    private Date faturaTarihi;
    private Sepet sepet;

    static {//Static blok
        firmaAdi = "ABC MARKET TİCARET ŞİRKETİ";
        firmaAdres = "ABC Plaza 4.kat no:123 İstanbul/Türkiye";
        webAdres = "www.abcmarket.com";
        mailAdres = "market@abcmarket.com";
        telNo = "+90 (216)123 3214";
    }
    public Fatura(Date faturaTarihi, Sepet sepet) {
        this.faturaTarihi = faturaTarihi;
        this.sepet = sepet;
        id++;
        setFaturaNo(id);
    }

    public static int getFaturaNo() {
        return faturaNo;
    }

    public static void setFaturaNo(int id) {
       Fatura.faturaNo = id;
    }

    public static String getFirmaAdi() {
        return firmaAdi;
    }

    public static void setFirmaAdi(String firmaAdi) {
        Fatura.firmaAdi = firmaAdi;
    }

    public static String getFirmaAdres() {
        return firmaAdres;
    }

    public static void setFirmaAdres(String firmaAdres) {
        Fatura.firmaAdres = firmaAdres;
    }

    public static String getWebAdres() {
        return webAdres;
    }

    public static void setWebAdres(String webAdres) {
        Fatura.webAdres = webAdres;
    }

    public static String getMailAdres() {
        return mailAdres;
    }

    public static void setMailAdres(String mailAdres) {
        Fatura.mailAdres = mailAdres;
    }

    public static String getTelNo() {
        return telNo;
    }

    public static void setTelNo(String telNo) {
        Fatura.telNo = telNo;
    }

    public Date getFaturaTarihi() {
        return faturaTarihi;
    }

    public void setFaturaTarihi(Date faturaTarihi) {
        this.faturaTarihi = faturaTarihi;
    }


    @Override
    public String toString() {
        SimpleDateFormat tarihFormatla = new SimpleDateFormat("dd-MMMM-yyyy  HH:mm:ss");

        String str = firmaAdi + "\n";
        str += firmaAdres + "\n";
        str += "            Web adresi  : " + webAdres +"\n";
        str += "            Mail        : " + mailAdres+"\n";
        str += "            Telefon     : " + telNo + "\n\n";
        str += "Fatura no: " + getFaturaNo() +  "    Tarih/Saat : " + tarihFormatla.format(faturaTarihi)  + "\n";
        str += "------------------------------------------------------------\n";
        str += sepet;
        return str;
    }
}
