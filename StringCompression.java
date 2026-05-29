public class StringCompression {
    public static void main(String[] args) {
        String abc="aaabbbccccddddd";
        char ch[]=abc.toCharArray();
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<=ch.length;i++){
            if(i==ch.length || ch[i]!=ch[i-1]){
                sb.append(ch[i-1]);
            
            if(count>1){
                sb.append(count);
            }
            count=1;
        }else count++;
        }
        System.out.println(sb);
    }
}
