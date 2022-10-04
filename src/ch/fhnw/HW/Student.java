package ch.fhnw.HW;

import java.util.ArrayList;

public class Student {


    private String name;
    private String major;
    private ArrayList<Double> gradeList = new ArrayList<>();

    public Student(String name, String major, ArrayList<Double> gradeList) {
        this.name = name;
        this.major = major;
        this.gradeList = gradeList;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getGradeList() {
        return gradeList;
    }

    public void setGradeList(ArrayList<Double> gradeList) {
        this.gradeList = gradeList;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
