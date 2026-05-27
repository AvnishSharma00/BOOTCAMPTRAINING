import java.util.Arrays;

public class PrefixArray {
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        int Prefix[]=new int[arr.length+1];
        Prefix[0]=0;
        for(int i=1;i<Prefix.length;i++){
            Prefix[i]=Prefix[i-1]+arr[i-1];
        }
        System.out.println( Arrays.toString(Prefix));
        int start=1;
        int end=3;
        System.out.println(Prefix[end]-Prefix[start-1]);
    }
}
