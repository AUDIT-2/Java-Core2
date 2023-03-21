/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day20_ClassesAndObjects;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Student.okulAdi = " + Student.okulAdi);

        Student ogrenci1 = new Student("Ahmet Falanca",12345,"Java");
        ogrenci1.bilgileriniYaz();

        Student ogrenci2 = new Student("Cin Ali",5322,"Matematik-2");
        ogrenci2.bilgileriniYaz();

        Student.okulAdi = "AUDIT-2 SDET Course";

        Student ogrenc3 = new Student("John Smith",11223234,"SDET-2");
        ogrenc3.bilgileriniYaz();

        ogrenci1.bilgileriniYaz();
        ogrenci2.bilgileriniYaz();

        Student ogrenci4 = new Student("Elizabeth");
        ogrenci4.okulNo = 12312;
        ogrenci4.bilgileriniYaz();

        ogrenci4.derseGir("Selenium");
        ogrenci1.derseGir("Java");
    }
}
