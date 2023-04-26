/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

public class LessonTest {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("Java");
        Lesson lesson2 = new Lesson("Java");
        Lesson lesson3 = new Lesson("SDLC");

        System.out.println(lesson1);
        System.out.println(lesson2);
        System.out.println(lesson3);
        System.out.println("lesson1.getLessonId() = " + lesson1.getLessonId());

    }
}
