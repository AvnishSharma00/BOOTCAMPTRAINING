public class RotateMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[0].length-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }

        }
        for(int[] n:matrix){
           for(int i:n){
            System.out.print(i);
           }
           System.out.println();
        }
    }
}
