import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        int max=arr[arr.length-1];
        List<Integer> list=new ArrayList<>();
        list.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
