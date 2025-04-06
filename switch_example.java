import java.util.*;
public class switch_example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Button Number");
        int button = sc.nextInt();
        // if (button == 1) {
        //     System.out.println("Hello");
        // }
        // else if (button == 2) {
        //     System.out.println("Namaste");
        // }
        // else if (button == 3) {
        //     System.out.println("hey");
        // }
        // else{
        //     System.out.println("Invalid Button");
        // }

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Nameste");
            break;
            case 3 : System.out.println("Hey");
            break;
            default : System.out.println("Invalid Button");
        }
    }
    
}
