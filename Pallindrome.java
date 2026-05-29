import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Non Palindrome");
        }
        sc.close();
    }

}
