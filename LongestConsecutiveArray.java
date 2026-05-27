public class LongestConsecutiveArray {
    public static void main(String[] args) {
        int maxlen=1;
        int currentlen=1;
        int end=0;
        int arr[]={1, 2, 3, 5, 6, 7, 8, 2};
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                currentlen++;
            }else{
                currentlen=1;
            }
            if(currentlen>maxlen){
                maxlen=currentlen;
                end=i;
            }
        }
        System.out.println(maxlen);
        
        for(int i=end-maxlen+1;i<=end;i++){
            System.out.print(arr[i]);
        }
    }
}
