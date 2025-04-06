import java.util.*;
public class adult_eligiblity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are Adult");
        }
        else{
            System.out.println("you are Miner");
            System.out.println("Bada sher ho yar tum to");
        }
    }
    
}
