package com.company;

import java.util.ArrayList;

public class Courses {

    String name;
    int average;
    ArrayList<Courses> courses = new ArrayList<Courses>();

    public Courses(String name, int average){
        this.name = name;
        this.average = average;
        courses.add(this);
    }

    public Courses(){}

    public Courses(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAverage(int average){
        this.average = average;
    }

    public int getAverage(){
        return average;
    }

}
