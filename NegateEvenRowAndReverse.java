public class NegateEvenRowAndReverse {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
         for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[i].length-1;
            while(start<end){
             int temp= matrix[start][i];
             matrix[start][i]=matrix[end][i];
             matrix[end][i]=temp;
             start++;
             end--;
            }

        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i%2==0){
                    System.out.print(matrix[i][j]*-1);
                }else{
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
