//The user can enter 2 numbers, either 1 or 0. If the user enter 1, then keep taking input from the user for a student mark(between 0 and 100). If the user enter 0, then exit the program.
//If he/she scores Marks >= 90, then print "This is Good". If 89>= Marks >= 60, then print "This is also Good". If 59>= Marks >= 0, then print "You can do better".
import java.util.Scanner;

public class Marks_Entry {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            int input;
            do{
                System.out.println("Enter the mask");
                int marks = sc.nextInt();
                if(marks >= 90 && marks<=100){
                    System.out.println("This is Good");
                }else if(marks >= 60 && marks<=89){
                    System.out.println("This is also Good");
                }else if (marks >= 0 && marks<=59){
                    System.out.println("You can do better");
                }else{
                    System.out.println("Invalid Input");    
                }    
                System.out.println("Enter 1 to continue or 0 to exit");
                input = sc.nextInt();

            }while(input == 1);    
        }

        
        
    }
}
