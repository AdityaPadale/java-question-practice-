import java.util.*;
public class ForeverForYou {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much do you love me");
        int love = sc.nextInt();
        for (int i = 1; i <= love; i++){
            System.out.println("I Love you " + love + " times");
        }


    }
}
