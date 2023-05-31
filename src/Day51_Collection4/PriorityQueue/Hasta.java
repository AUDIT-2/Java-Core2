/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.PriorityQueue;

public class Hasta implements Comparable{
    String name;
    int priority;

    public Hasta(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    //Priority property sine göre karşılaştırma-önceliklendirme
    @Override
    public int compareTo(Object o) {
        return  ((Hasta)o).priority - this.priority; //Büyükten küçüğe
      // return this.priority - ((Hasta)o).priority; //Küçükten büyüğe
    }

    //Name property sine göre karşılaştırma-önceliklendirme
   /* @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Hasta)o).name) ; //Küçükten büyüğe
     //   return  ((Hasta)o).name.compareTo(this.name) ; //Büyükten küçüğe
    }*/
}
