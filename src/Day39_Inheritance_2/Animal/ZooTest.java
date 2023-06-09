/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.Animal;

public class ZooTest {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Ali Babanın Çiftliği","Zoo-land no:123/122");

        zoo1.addDog(new Dog("Boby",5,"Beyaz"));
        zoo1.addDog(new Dog("Karabaş",15,"Black"));

        for (Dog dog: zoo1.getDogs()){
            System.out.println(dog);
        }

        for(Object obj: zoo1.getTypeless()){
            System.out.println(obj);
        }

        zoo1.addBird(new Bird("Cici kuş",3,"Beyaz"));
        zoo1.addBird(new Bird("Kanarya",3,"Sarı"));
        for(Bird bird: zoo1.getBirds()){
            System.out.println(bird);
        }

        for(Object obj: zoo1.getTypeless()){
            if(obj instanceof Dog){ // rastladığımız obj Dog sınıfından ise
                System.out.println("Dogs");
                System.out.println("------------");
                System.out.println(obj);
            }
            if(obj instanceof Bird){ // rastladığımız obj Bird sınıfından ise
                System.out.println("Birds");
                System.out.println("------------");
                System.out.println(obj);
            }

            if(obj instanceof Integer){ // rastladığımız obj Integer sınıfından ise
                System.out.println("I am an Integer");
                System.out.println(obj);
                System.out.println("İki katı = " + (((Integer) obj) * 2));
            }
            if(obj instanceof String){ // rastladığımız obj String sınıfından ise
                System.out.println("I am an String");
                System.out.println(obj);
                System.out.println("Uppercase : " + ((String) obj).toUpperCase());
            }

        }

        System.out.println("---------------------------------");

        zoo1.addAnimal(new Dog("Dog1",12,"Siyah"));
        zoo1.addAnimal(new Dog("Dog2",21,"Beyaz"));
        zoo1.addAnimal(new Dog("Dog3",2,"Siyah"));
        zoo1.addAnimal(new Dog("Dog4",12,"Siyah"));
        zoo1.addAnimal(new Bird("Bird5",5,"Sarı"));
        zoo1.addAnimal(new Bird("Bird2",13,"Beyaz"));
        zoo1.addAnimal(new Bird("Bird3",3,"Sarı"));
        zoo1.addAnimal(new Bird("Bird1",1,"Beyaz"));

        for (Animal animal: zoo1.getAnimals()){
            System.out.println(animal);
            animal.makeSound(); //Parent (Animal) sınıfının ya da override edilmiş child sınıfın metodları
            animal.eat(); //Parent (Animal) sınıfının ya da override edilmiş child sınıfın metodları
            if (animal instanceof Bird){ // rastladığımız animal Bird sınıfından ise
                System.out.println("Ben bir kuşum..");
                ((Bird) animal).fly(); // Bird sınıfına cast(dönüştür) ediyoruz. Ve Bird sınıfına özel metoda erişebiliyoruz.
            }
        }
    }
}
