/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

import java.util.Scanner;

public class CourseManager {
    public static void addStudent(Course course){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String strName;
            double dblPayment;
            System.out.print("Please enter name of student : ");
            strName = scanner.nextLine();

            if(strName.isBlank() || strName.isEmpty()){
                System.out.println("Name field cannot be empty or blank!");
                System.out.print("Continue to add Student (Y/N)? ");
                if (scanner.nextLine().equalsIgnoreCase("N")){
                    break;
                }
            }else {
                System.out.print("Please enter payment : ");
                dblPayment = Double.parseDouble(scanner.nextLine());

                Student std = new Student(strName,dblPayment);
                course.addStudent(std);
                System.out.println("Student " + std.getName() + " added to " + course.getCourseName());
            }
        }
    }

    public static void addTeacher(Course course){

    }

    public static void addLesson(Course course){

    }

    public static void addTeacherToLesson(){

    }

    public static void addStudentToLesson(){

    }

    public static void main(String[] args) {
        Course course1 = new Course("SDET",150);
        Lesson lesson1 = new Lesson("Java");
        Lesson lesson2 = new Lesson("SDLC");

        Teacher teacher1 = new Teacher("Ali Hoca",100);
        Teacher teacher2 = new Teacher("Seda Hoca",100);

        Student student1 = new Student("Mehmet Öğrenci",100);
        Student student2 = new Student("Zeynep Öğrenci",100);

        lesson1.addTeacher(teacher1);
        lesson2.addTeacher(teacher1);
        lesson2.addTeacher(teacher2);

        lesson1.addStudent(student1);
        lesson1.addStudent(student2);
        lesson2.addStudent(student1);

        course1.addLesson(lesson1);
        course1.addLesson(lesson2);

        course1.addTeacher(teacher1);
        course1.addTeacher(teacher2);

        course1.addStudent(student1);
        course1.addStudent(student2);

      /*  System.out.println("course1.showTeachers() = " + course1.showTeachers());

        System.out.println("course1.showStudents() = " + course1.showStudents());

        System.out.println("course1.showLessons() = " + course1.showLessons());

        System.out.println("lesson1.showTeachers() = " + lesson1.showTeachers());
        System.out.println("lesson1.showStudents() = " + lesson1.showStudents());
        System.out.println("lesson2.showTeachers() = " + lesson2.showTeachers());
        System.out.println("lesson2.showStudents() = " + lesson2.showStudents());*/

        addStudent(course1);
        System.out.println(course1.showStudents());
        System.out.println("lesson1.showTeachers() = " + lesson1.showTeachers());
        System.out.println("lesson1.showStudents() = " + lesson1.showStudents());
        System.out.println("lesson2.showTeachers() = " + lesson2.showTeachers());
        System.out.println("lesson2.showStudents() = " + lesson2.showStudents());
    }


}
