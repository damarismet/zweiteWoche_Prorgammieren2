package ch.fhnw.HW;


import java.io.File;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = Scanner.readData(new File("/Users/damarismettler/Desktop/Studium FHNW/3. Semester/Programmieren2/zweiteWoche_Prorgammieren2/src/ch/fhnw/HW/data.txt"));

        if (!studentList.isEmpty()) {
            System.out.println("Number of students read: " + studentList.size());
            displayAverageGrades(studentList);
        } else {
            System.out.println("Unable to read student data, sorry.");
        }
    }

    private static void displayAverageGrades(ArrayList<Student> studentList) {
        double summe = 0;
        double lowestgrade = 0;
        double average = 0;

        for(int i = 0; i < studentList.size(); i++){
            summe = 0;
            lowestgrade = studentList.get(i).getGradeList().get(0);
            for(int j = 0; j < studentList.get(i).getGradeList().size(); j++) {
                if(lowestgrade > studentList.get(i).getGradeList().get(j)){
                    lowestgrade = studentList.get(i).getGradeList().get(j);
                }
                summe = summe + studentList.get(i).getGradeList().get(j);
            }
            summe = summe - lowestgrade;
            average = summe / ((studentList.get(i).getGradeList().size()-1));
            System.out.println("The average grade for " + studentList.get(i).getName() +" (" +studentList.get(i).getMajor() + ")" + " is: " + Math.round(average * 10) / 10.0);
        }
    }
}
