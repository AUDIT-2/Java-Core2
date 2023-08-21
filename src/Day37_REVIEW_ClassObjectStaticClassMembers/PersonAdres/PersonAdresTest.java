/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.PersonAdres;

public class PersonAdresTest {

    public static void main(String[] args) {
        Adres isAdresi = new Adres("Kahramanlar caddesi no :35/123 ","Ortaköy","İstanbul");
        Adres evAdresi = new Adres("Koşuyolu sokak no :354/23 ","Ortaköy","İstanbul");
        Adres okulAdresi = new Adres("Bogaziçi caddesi no :5/12 ","Sarıyer","İstanbul");

        Telefon ev = new Telefon(216,3456789);
        Telefon is = new Telefon(212,1456882);
        Telefon cep = new Telefon(555,3456789);

        Person person1 = new Person("Ahmet Filanca",evAdresi,okulAdresi,isAdresi);

        person1.setEvTelefon(ev);
        person1.setIsTelefon(is);
        person1.setCepTelefon(cep);
        person1.setFaxTelefon(new Telefon(212,1456885));

        Rehber.addRehber(person1);

        //Başka bir yöntemle Personel ve Adres ekleme.
        Rehber.addRehber(new Person("John Smith",
                new Adres("ABC Caddesi ","XYZ İlçesi","ANKARA"),
                new Adres("Okullar Caddesi","Mektep İlçesi","ANKARA"),
                new Adres("ABC Caddesi A-Plaza no : 123-A","XYZ İlçesi","ANKARA")));

        Rehber.showRehber();
    }
}
