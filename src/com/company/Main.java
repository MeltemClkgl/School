package com.company;
import java.util.*;

//Student Class:
//Student will have:
//      -Name
//      -id
//      -courses

//Courses will have:
//      -name of the course
//      -first exam
//      -second exam

//If students average is lower than class average: not passing, otherwise passes
//Marks: AA, BA, BB, CB, CC, DC, DD
//40: DD, 40-50: DC, 50-60: CC, 60-70: CB, 70-80: BB, 80-90: BA, 90-100: AA
//Show which student passed/not passed which course (if passed the grade)
//Show the average of each course


public class Main {

    public static void main(String[] args) {

        String name, id, course_name, course_Name;
        int first, second, user_selectionStart;
        int object_counter = 0;
        Scanner scan = new Scanner(System.in);
        GradeReport greport = new GradeReport();

        Courses math = new Courses("Math");
        Courses chem = new Courses("Chemistry");
        Courses bio = new Courses("Biology");
        Courses lit = new Courses("Literature");
        Courses geo = new Courses("Geography");
        Courses physed = new Courses("Phys-Ed");
        Courses history = new Courses("History");

        Student studenta = new Student("Adam", "123456", math);
        Student studentb = new Student("Eve", "45678", chem);
        Student studentc = new Student("Aphrodite", "345345", bio);
        Student studentd = new Student("Zeus", "876976", lit);
        Student studente = new Student("Persephone", "2353475", geo);

        studenta.addCourse(history);
        studentb.addCourse(physed);
        studentc.addCourse(history);
        studentd.addCourse(physed);
        studentd.addCourse(math);
        studente.addCourse(chem);

        math.setAverage(40);
        chem.setAverage(67);
        bio.setAverage(88);
        lit.setAverage(32);
        geo.setAverage(46);
        physed.setAverage(85);
        history.setAverage(70);

        studenta.setGrades("Math", 40, 40);
        studenta.setGrades("History", 60, 95);

        studentb.setGrades("Chemistry", 78, 23);
        studentb.setGrades("Phys-Ed", 100, 100);

        studentc.setGrades("Biology", 40, 40);
        studentc.setGrades("History", 12, 41);

        studentd.setGrades("Literature", 88, 68);
        studentd.setGrades("Phys-Ed", 70, 70);
        studentd.setGrades("Math", 100, 98);

        studente.setGrades("Geography", 50, 50);
        studente.setGrades("Chemistry", 50, 50);

        greport.getGradeReport(studenta);
        greport.getGradeReport(studentb);
        greport.getGradeReport(studentc);
        greport.getGradeReport(studentd);
        greport.getGradeReport(studente);
    }
}

