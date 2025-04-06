public class trial {
    public static void main (String[] args){
        int arr[] = {3,5,6,8,3,5,24};
        int max = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    } 
}
