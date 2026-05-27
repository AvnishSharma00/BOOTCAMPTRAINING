import java.util.Arrays;

public class DutchFlag {
    public static void main(String[] args) {
        int arr[]={2,0,1,2,2,1,1,0,0};
        int start=0;
        int mid=0;
        int end=arr.length-1;
        while(mid<=end){
             if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[start];
                arr[start]=temp;
                mid++;
                start++;
             }else if(arr[mid]==1){
                mid++;
             }else{
                int temp=arr[mid];
                arr[mid]=arr[end];
                arr[end]=temp;
                end--;
             }
             
        }
        System.out.println(Arrays.toString(arr));
    }
}
