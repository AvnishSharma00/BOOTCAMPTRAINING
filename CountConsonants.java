
public class CountConsonants {
    public static boolean isVowel(char ch){
        if(ch=='A'|| ch=='a'|| ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="avnish";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!isVowel(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
