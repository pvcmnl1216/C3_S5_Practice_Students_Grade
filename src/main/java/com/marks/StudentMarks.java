/*
 * Author Name: Philip Meshach
 * Date: 30-08-2022
 * Praise The Lord
 */
package com.marks;

public class StudentMarks {
public int calculateMarksForMedicalPathway(int maths, int physics, int chemistry, int biology){

    int totalmarks = (maths+physics+chemistry+biology);
    int sum = totalmarks;
    return sum ;
}
public int calculateMarksForNonMedicalPathway(int maths,int physics,int chemistry){
    int totalmarks = (maths+physics+chemistry);
    int sum = totalmarks;
    return sum;
}
public int calculateMarksForBusinessPathWay(int businessstudies,int finance ,int accounting){
    int totalmarks = (businessstudies+finance+accounting);
    int sum = totalmarks;
    return sum;
}
}
