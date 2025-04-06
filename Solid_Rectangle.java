import java.util.*;
public class solid_rectanle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of rectangle");
        int n = sc.nextInt();
        System.out.println("Enter base of rectangle");
        int m = sc.nextInt();
       
        // nested for loop (for loop comes inside other for loop)
        for(int counter = 1; counter <= n; counter++){
            for(int j = 1; j <= m; j++){
                System.out.print("* ");
            }
           
          System.out.println();
        }
        
    }
    
}
 
