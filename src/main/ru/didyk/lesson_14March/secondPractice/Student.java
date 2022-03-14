package ru.didyk.lesson_14March.secondPractice;

public class Student {

    private String fullName;
    private String speciality;
    private Integer gpaScore;

    public Student(String fullName, String speciality, Integer gpaScore) {
        this.fullName = fullName;
        this.speciality = speciality;
        this.gpaScore = gpaScore;
    }

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getGpaScore() {
        return gpaScore;
    }

    public void setGpaScore(Integer gpaScore) {
        this.gpaScore = gpaScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", gpaScore=" + gpaScore +
                '}';
    }
}
