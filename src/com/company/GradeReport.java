package com.company;


//If students average is lower than class average: not passing, otherwise passes
//Marks: AA, BA, BB, CB, CC, DC, DD
//40: DD, 40-50: DC, 50-60: CC, 60-70: CB, 70-80: BB, 80-90: BA, 90-100: AA
//Show which student passed/not passed which course (if passed the grade)
//Show the average of each course


import java.util.ArrayList;

public class GradeReport {
    int average_left, grade, counter;

    ArrayList<Courses> courses_list = new ArrayList<Courses>();

    public GradeReport(){}

    public void getGradeReport(Student student){
        courses_list = student.courses_list;
        String grades_student = "The grades of " + student.getName() + " with ID " +student.getID() + " are as follows: \n";
        for(Courses a : courses_list){
            average_left = 100-a.getAverage();
            counter = average_left/6;
            grade = student.grades.get(a.getName());

            if(grade == a.getAverage()){
                grades_student = grades_student + "\t" +a.getName() + ": Course average was " +a.getAverage() + " while Student PASSED with DD"+" (" + student.grades.get(a.getName())+ ")"+ "\n";
            }
            else if(grade >= a.getAverage() && grade <= (a.getAverage()+counter)){
                grades_student = grades_student + "\t" +a.getName() + ": Course average was " +a.getAverage() + " while Student PASSED with DC"+" (" + student.grades.get(a.getName())+ ")"+ "\n";
            }
            else if(grade >= (a.getAverage()+counter) && grade <= (a.getAverage()+counter*2)){
                grades_student = grades_student + "\t" +a.getName() + ": Course average was " +a.getAverage() + " while Student PASSED with CC" +" (" + student.grades.get(a.getName())+ ")"+  "\n";
            }
            else if(grade >= (a.getAverage()+counter*2) && grade <= (a.getAverage()+counter*3)){
                grades_student = grades_student + "\t" +a.getName() + ": Course average was " +a.getAverage() + " while Student PASSED with CB"+" (" + student.grades.get(a.getName())+ ")"+"\n";
            }
            else if(grade >= (a.getAverage()+counter*3) && grade <= (a.getAverage()+counter*4)){
                grades_student = grades_student + "\t" +a.getName() + ": Course average was " +a.getAverage() + " while Student PASSED with BB"+" (" + student.grades.get(a.getName())+ ")"+ "\n";
            }
            else if(grade >= (a.getAverage()+counter*4) && grade <= (a.getAverage()+counter*5)){
                grades_student = grades_student + "\t" +a.getName() + ": Course average was " +a.getAverage() + " while Student PASSED with BA"+" (" + student.grades.get(a.getName())+ ")"+ "\n";
            }
            else if(grade >= (a.getAverage()+counter*5) && grade <= (100)){
                grades_student = grades_student + "\t" +a.getName() + ": Course average was " +a.getAverage() + " while Student PASSED with AA"+" (" + student.grades.get(a.getName())+ ")"+"\n";
            }
            else{
                grades_student = grades_student + "\t" +a.getName() + ": Course average was " +a.getAverage() + " while Student FAILED with FF"+" (" + student.grades.get(a.getName())+ ")"+ "\n";
            }

        }
        System.out.println(grades_student);
    }
}
