import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the number");
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=number/2; i++){
            if(number%i ==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(number == 1){
                System.out.println("1 is neither prime nor composite");
            }else{
                System.out.println(""+number+" is a prime number");
            }
        }
        else{
            System.out.println(""+number+" is a composite number");
        }

       } 
    }
}