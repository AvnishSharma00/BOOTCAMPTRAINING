import java.util.*;
public class RemoveVowel{
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!isVowel(((str.charAt(i))))){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
        sc.close();

    }
}