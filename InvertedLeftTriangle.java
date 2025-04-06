public class InvertedLeftTriangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(m);
                if(j<i){
                    
                System.out.print(" * ");
                }
            }
            System.out.println();
            m+=2;
        }
    }
}
