import java.util.Scanner;
import java.util.*;
//------ STUDENT GRADE CALCULATOR----->
public class task2 {
   public static void main(String args[]){
     int numGrades;
    int[] grades;
    try(Scanner scanner=new Scanner(System.in)){
        System.out.print("Enter the number of Grades:- ");
        numGrades=scanner.nextInt();
        grades=new int[numGrades];

        for(int i=0;i<numGrades;i++){
            System.out.print("Enter the Grades: "+(i+1)+": ");
            grades[i]=scanner.nextInt();

        }
    }

    int total=0;
    for(int i=0;i<numGrades;i++){
        total+=grades[i];

    }
    double average=(double)total/numGrades;

    System.out.println("Average Grade is : "+average);

   }

    
}
