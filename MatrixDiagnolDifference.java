public class MatrixDiagnolDifference {
    public static void main(String[] args) {
        int leftDiagnol=0;
        int rightDiagnol=0;
        int martrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int  n=martrix.length;
        for(int i=0;i<martrix.length;i++){
            leftDiagnol+=martrix[i][i];
            rightDiagnol+=martrix[i][n-i-1];
        }
        System.out.println(Math.abs(rightDiagnol-leftDiagnol));
    }
}
