import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1=sc.next();
        String st2=sc.next();
        String st3=sc.next();
        st1=st1.replace(st2, st3);
        System.out.println(st1);
        sc.close();
       
    }
}
