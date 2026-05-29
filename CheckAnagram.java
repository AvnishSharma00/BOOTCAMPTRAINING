import java.util.Scanner;

public class CheckAnagram {
    public static boolean isAnagram(String str1,String str2){
            if(str1.length()!=str2.length()){
              return false;
        }
         int freq[]=new int[26];
           for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println("Not anagram");
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           String st1=sc.next();
           String st2=sc.next();
           System.out.println(isAnagram(st1, st2));
           sc.close();
       
      
    }
}
