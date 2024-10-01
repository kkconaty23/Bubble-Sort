public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[] {5,7,1,3,9,12,55,16};
        for(int i = 0; i < arr.length; i++){
            int min = arr[i];
            for(int j =i; j <arr.length; j++){ //sort array from lowest to highest
                if (arr[j] < min)
                {
                    int temp = arr[j];
                    arr[j] = min;
                    min = temp;
                }
            }
            arr[i] = min;
        }
        for(int i =0;i <arr.length ; i++){  //print array 
            System.out.print(arr[i] + " ");
        }
        
    }
}
