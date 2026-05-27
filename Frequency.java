import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=arr.length-1;
        int freq[]=new int[20];
        for(int a:arr){
            freq[a]++;
        }
        int thres=count/4;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>thres){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
