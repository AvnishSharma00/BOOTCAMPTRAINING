public class LargestAndSmallest {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]={43,1,3,2,3,4,2,34,433};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max Number :"+max);
        System.out.println("Minimum Number :"+min);
    }
}
