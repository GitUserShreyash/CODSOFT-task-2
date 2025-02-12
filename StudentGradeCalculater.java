package project;
import java.util.Scanner;
public class StudentGradeCalculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects:");
        int total_Subject=sc.nextInt();
        int totalMarks=0;
        for (int i=1;i<=total_Subject;i++){
            System.out.print("Enter the marks obtained in subject " + i +" (Out of 100):");
            totalMarks=totalMarks+ sc.nextInt();
        }
        double averagePercentage= (double) totalMarks/total_Subject;
        String grade=" ";
        if (averagePercentage>=90){
            grade="A+";
        } else if (averagePercentage>=80) {
            grade="A";
        }else if (averagePercentage>=70) {
            grade="B";
        }else if (averagePercentage>=60) {
            grade="C";
        }else if (averagePercentage>=50) {
            grade="D";
        }
        System.out.println("Total Marks:"+totalMarks+"\n"+"Average Percentage:"+averagePercentage+"\n"+"Grade:"+grade);
    }
}