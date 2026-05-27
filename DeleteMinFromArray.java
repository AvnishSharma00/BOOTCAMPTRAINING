import java.util.Arrays;

public class DeleteMinFromArray {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,-4,6};
        int arr1[]=new int[arr.length-1];
        int min=Integer.MAX_VALUE;
        int index=-1;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                index=i;
                min=arr[i];
            }
        }
        int i=0;
        while(i<arr.length){
            if(i==index){
                i++;
                continue;
            }
            arr1[k++]=arr[i];
            i++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
