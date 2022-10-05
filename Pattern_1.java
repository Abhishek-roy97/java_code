import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
    
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the no of columns: ");
            int n = sc.nextInt();
            System.out.println("Enter the no of rows: ");
            int m = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }
}
