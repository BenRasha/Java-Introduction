package ProgrammingWithClasses.SimpleClassesAndObjects.Task3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    String name;
    int groupNumber;
    int []marks;
    public Student(String name,int groupNumber, int[]marks){
        this.name=name;
        this.groupNumber=groupNumber;
        this.marks=marks;
    }
    public static void goodStudent(Student []students){
        for (Student student:students){
            boolean good=true;
            for (int mark:student.marks){
                if(mark!=9 && mark!=10){
                    good=false;
                    break;
                }
            }
            if (good){
                System.out.println("Name:"+student.name);
                System.out.println("Group number:"+student.groupNumber);
            }
        }
    }
}
