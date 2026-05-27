import java.util.Scanner;

public class DifferenceOfFirstAndLastElementOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int first=arr[0];
        int last=arr[arr.length-1];
        System.out.println(first-last);
        sc.close();
        
    }
}
