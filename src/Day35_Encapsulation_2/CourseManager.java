/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

public class CourseManager {
    public static void main(String[] args) {
        Course course1 = new Course("SDET",150);
        Lesson lesson1 = new Lesson("Java");
        Lesson lesson2 = new Lesson("SDLC");

        Teacher teacher1 = new Teacher("Ali Hoca",100);
        Teacher teacher2 = new Teacher("Seda Hoca",100);

        Student student1 = new Student("Mehmet Öğrenci",100);
        Student student2 = new Student("Zeynep Öğrenci",100);


        course1.addLesson(lesson1);
        course1.addLesson(lesson2);

        course1.addTeacher(teacher1);
        course1.addTeacher(teacher2);

        course1.addStudent(student1);
        course1.addStudent(student2);

        System.out.println("course1.showTeachers() = " + course1.showTeachers());

        System.out.println("course1.showStudents() = " + course1.showStudents());

        System.out.println("course1.showLessons() = " + course1.showLessons());
    }

}
