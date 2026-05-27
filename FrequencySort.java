import java.util.Arrays;

public class FrequencySort {
    public static void main(String[] args) {
        int arr[]={1,4,5,2,4,3,3,2,3,35,7,8,8,8,5,11,1,9};
        int arrNew[]=new int[arr.length];
        int max=Integer.MIN_VALUE;
        for(int a:arr){
            if(a>max){
                max=a;
            }
        }
        int freqArray[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freqArray[arr[i]]++;
        }
        System.out.println(Arrays.toString(freqArray));
        int k=0;
        for(int i=0;i<freqArray.length;i++){
            while(freqArray[i]>0){
                 arrNew[k++]=i;
                 freqArray[i]--;
            }
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
