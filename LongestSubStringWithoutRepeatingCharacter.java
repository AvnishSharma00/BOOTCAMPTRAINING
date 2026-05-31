import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s="pwwkew";
        int left=0;
        int maxLen=0;
        int start=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                 set.remove(s.charAt(left));
                 left++;
            }
            set.add(s.charAt(i));
            int len=i-left+1;
            if(len>maxLen){
                maxLen=len;
                start=left;
            }
        }
        System.out.println(maxLen);
        System.out.println(s.substring(start,start+maxLen));
    }
}
