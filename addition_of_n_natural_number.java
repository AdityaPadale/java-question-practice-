import java.util.*;
public class addition_of_n_natural_number {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int counter = 1; counter<=n; counter++){
            sum = sum + counter;
            

        }
              System.out.println("Addition of first " + n + " natural number is " + sum);
     }
     
}
