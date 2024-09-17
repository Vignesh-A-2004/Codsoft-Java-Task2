import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter No. Of Subjects");
        int n = sc.nextInt();
        int total = 0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter Marks of "+i+" :");
            int marks = sc.nextInt();
            total+=marks;
        }
        double avg=(double)total/n;
        char grade;
        if(avg>=90){
            grade='O';
        }
        else if(avg>=80){
            grade='A';
        }
        else if(avg>=70){
            grade='B';
        }
        else if(avg>=60){
            grade='C';
        }
        else if(avg>=50){
            grade='D';
        }
        else if(avg>=40){
            grade='E';
        }
        else {
            grade='F';
        }
        System.out.println("Total Marks is :"+total);
        System.out.println("Average Marks gained :"+avg);
        System.out.println("Grade :"+grade);

    }
}
