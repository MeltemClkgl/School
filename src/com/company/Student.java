package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    ArrayList<Courses> courses_list = new ArrayList<Courses>();
    Map<String, Integer> grades = new HashMap<String, Integer>();


    String name, id;


    public Student(String name, String id, Courses courses) {
        this.name = name;
        this.id = id;
        courses_list.add(courses);
    }

    public void setGrades(String course_name, int first, int second){
        int grade;
        for(Courses a : courses_list){
            if(a.getName().equalsIgnoreCase(course_name)){
                grade = (first+second)/2;
                grades.put(course_name, grade);
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public void addCourse(Courses course){
        courses_list.add(course);
    }

    public String getID(){
        return this.id;
    }

}
