public class Matrix180{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=3;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }
        }
        for(int i=0;i<n/2;i++){
            int temp[]=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int a[]:arr){
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}