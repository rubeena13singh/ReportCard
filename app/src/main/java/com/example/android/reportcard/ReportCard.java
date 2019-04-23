package com.example.android.reportcard;

/**
 * Created by Dell on 6/14/2017.
 */

public class ReportCard {
    private String studentName;
    private int rollNumber;

    private int englishMarks;
    private int mathMarks;
    private int physicsMarks;
    private int chemistryMarks;

    private int sum;
    private int average;

    public ReportCard(int chemistryMarks, int physicsMarks, int mathMarks, int englishMarks, String studentName, int rollNumber) {
        this.chemistryMarks = chemistryMarks;
        this.physicsMarks = physicsMarks;
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    private String getGrade(int eng, int math, int phy, int chem) {
        String grade = "A";
        sum = eng + math + phy + chem;
        average = sum / 4;

        if (average >= 90) {
            grade = "A";
        } else if (average < 90 && average >= 80) {
            grade = "B";
        } else if (average < 80 && average >= 70) {
            grade = "C";
        } else if (average < 70 && average >= 60) {
            grade = "D";
        } else if (average < 60) {
            grade = "Fail";
        }
        return grade;
    }

    @Override
    public String toString() {
        return "\nStudent Name = " + studentName +
                "\nRoll Number = " + rollNumber +
                "\nEnglish = " + englishMarks +
                "\nMath = " + mathMarks +
                "Physics = " + physicsMarks +
                "\nChemistry = " + chemistryMarks +
                "\nGrade = " + getGrade(englishMarks, mathMarks, physicsMarks, chemistryMarks);
    }
}
