/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.PersonalManagement;

import java.util.ArrayList;

public class FabrikaTest {
    String name;
    private final ArrayList<Person> personel;

    public FabrikaTest(String name) {
        this.name = name;
        this.personel = new ArrayList<>();
    }

    public static void main(String[] args) {
        FabrikaTest fabrika = new FabrikaTest("ABC Fabrikası");

        Person person;

        person = new Worker("Ahmet Worker", 12334567, 2345);
        fabrika.personel.add(person);

        person = new Worker("Mehmet Worker", 324235334, 45667);
        fabrika.personel.add(person);

        person = new Engineer("Ayşe Mühendis", 232334345);
        fabrika.personel.add(person);

        person = new Teacher("Hasan Teacher", 12233451);
        fabrika.personel.add(person);

        for (Person personel: fabrika.personel){
            System.out.println("Ben " + personel.getClass().getSimpleName() + " sınıfının bir nesnesiyim.");
            System.out.println(personel.showInfo());
            personel.work(); //Polymorphism
            if (personel instanceof Engineer){
                ((Engineer) personel).doDesign(); //DownCasting Person ---> Engineer
            }
            if (personel instanceof Teacher){
                ((Teacher) personel).doExam(); //DownCasting Person ---> Teacher
            }
            System.out.println();
        }
    }
}
