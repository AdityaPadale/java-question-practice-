public class largest_number {
    public static void main (String[] args){
        int arr [] = {1, 23, 34, 66, 89, 23, 2, 421, 424, 34, 24};
        int max = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
