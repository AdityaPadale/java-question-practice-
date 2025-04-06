public class ascending_sorting {
    public static void main (String[] args){
        int arr[] = {4,5,42,5,3,34};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int temp;
                if(arr[j] > arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                
                
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
