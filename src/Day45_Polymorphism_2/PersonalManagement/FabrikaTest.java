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

        Person person; //Polymorphic variable.

        person = new Worker("Ahmet Worker", 12334567, 2345);
        fabrika.personel.add(person);

        person = new Worker("Mehmet Worker", 324235334, 45667);
        fabrika.personel.add(person);

        person = new Engineer("Ayşe Mühendis", 232334345);
        fabrika.personel.add(person);

        person = new Teacher("Hasan Teacher", 12233451);
        fabrika.personel.add(person);

        System.out.println(fabrika.name + " Personel Listesi.");
        System.out.println("------------------------------------");
        for (Person personel: fabrika.personel){

            System.out.println("Ben " + personel.getClass().getSimpleName().toUpperCase() + " sınıfının bir nesnesiyim.");
            System.out.println(personel.showInfo());
            personel.work(); //Polymorphism---every instance invoke its own version(override) of .work() method
            if (personel instanceof Engineer){
                ((Engineer) personel).doDesign(); //DownCasting Person ---> Engineer. In order to invoke Child class method
            }
            if (personel instanceof Teacher){
                ((Teacher) personel).doExam(); //DownCasting Person ---> Teacher. In order to invoke Child class method
            }
            System.out.println();
        }
    }
}
