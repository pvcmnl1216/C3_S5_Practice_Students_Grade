/*
 * Author Name: Philip Meshach
 * Date: 30-08-2022
 * Praise The Lord
 */
package com.marks;

public class studentsMarksImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.calculateMarksForMedicalPathway(76,98,70,79);
        studentMarks.calculateMarksForNonMedicalPathway(87,87,89);
        studentMarks.calculateMarksForBusinessPathWay(78,87,88);
        System.out.println("calculateMarksForBusinessPathWay = " + studentMarks.calculateMarksForBusinessPathWay(78,87,88));
        System.out.println("studentMarks.calculateMarksForMedicalPathway = " + studentMarks.calculateMarksForMedicalPathway(76,98,70,79));
        System.out.println("studentMarks.calculateMarksForNonMedicalPathway = " + studentMarks.calculateMarksForNonMedicalPathway(87,87,89));
    }
}
