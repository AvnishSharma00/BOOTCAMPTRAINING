import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int left=0;
        int right=arr[0].length-1;
        int top=0;
        int bottom=arr.length-1;
        List<Integer> ans=new ArrayList<>();
        while(left<=right && top<=bottom){
             for(int i=left;i<=right;i++){
                 ans.add(arr[top][i]);
             }
             top++;
             for(int i=top;i<=bottom;i++){
                ans.add(arr[i][right]);
             }
             right--;
             if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
             }
             if(left<=right){
                for(int i=bottom;i>=top;i--){
                   ans.add(arr[i][left]);
                }
             }
             left++;
        }
        System.out.println(ans);
        
    }
}
