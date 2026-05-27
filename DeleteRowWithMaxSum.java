import java.util.Scanner;

public class DeleteRowWithMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int row=sc.nextInt();
        System.out.println("Enter Number of Columns");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        int maxSum=0;
        int index=-1;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                index=i;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(index==i){
                    continue;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
