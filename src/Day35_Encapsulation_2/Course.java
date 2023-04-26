/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private static int id = 9000;
    private String courseName;
    private double coursePrice;

    private ArrayList<Lesson> lessons;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;


    public Course(String courseName, double coursePrice) {
        setId();
        setCourseName(courseName);
        setCoursePrice(coursePrice);
        lessons = new ArrayList<>();
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    private int getId() {
        return id;
    }

    private void setId() {
        id++;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void addLesson(Lesson lesson){
        this.lessons.add(lesson);
    }
    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public String showLessons(){
        String str = this.courseName + " - Lesson List \n";
        str+="------------------------------------\n";
        str+="Sn\tLesson Id\tLesson Name\n";
        str+="--\t----------\t--------------------\n";
        int sNo = 1;
        for (Lesson lesson:lessons){
            str+= sNo++ + "-\t" + lesson.getLessonId() + "\t\t" + lesson.getLessonName() + "\n";
        }
        return str;
    }
    public String showStudents(){
        String str = this.courseName + " - Student List \n";
        str+="------------------------------------\n";
        str+="Sn\tStudent Id\tStudent Name\n";
        str+="--\t----------\t--------------------\n";
        int sNo = 1;
        for (Student student:students){
            str+= sNo++ + "-\t" + student.getStudentId()+ "\t\t" + student.getName() + "\n";
        }
        return str;
    }
    public String showTeachers(){
        String str = this.courseName + " - Teachers List \n";
               str+="------------------------------------\n";
               str+="Sn\tTeacher Id\tTeacher Name\n";
               str+="--\t----------\t--------------------\n";
               int sNo = 1;
               for (Teacher teacher:teachers){
                   str+= sNo++ + "-\t" + teacher.getTeacherId() + "\t\t" + teacher.getName() + "\n";
               }
        return str;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePrice=" + coursePrice +
                ", lessons=" + lessons +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }
}
