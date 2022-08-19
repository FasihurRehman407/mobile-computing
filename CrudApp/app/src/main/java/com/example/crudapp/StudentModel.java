package com.example.crudapp;

public class StudentModel {
    private String name;
    private int rollNumber;
    private boolean isEnroll;
    private int id;

    @Override
    public String toString() {
        return "id="+id+","+"name=" + name +
                ", rollNumber=" + rollNumber +
                ", isEnroll=" + isEnroll;
    }

    public StudentModel(String name, int rollNumber, boolean isEnroll,int id) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.isEnroll = isEnroll;
        this.id=id;
    }
    public StudentModel(String name, int rollNumber, boolean isEnroll) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.isEnroll = isEnroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNmber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public boolean isEnroll() {
        return isEnroll;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}
}
