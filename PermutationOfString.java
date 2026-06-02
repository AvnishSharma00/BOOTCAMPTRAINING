import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfString {
    public static void permutate(char ch[],int index){
        if(index==ch.length){
            System.out.println(new String(ch));
            return;
        }
        for(int i=index;i<ch.length;i++){
            swap(ch,i,index);
            permutate(ch, index+1);
            swap(ch,i,index);
        }
    }
    public static void swap(char[] ch,int start,int end){
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        permutate(ch, 0);

    }
}
