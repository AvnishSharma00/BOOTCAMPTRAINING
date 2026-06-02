import java.util.Scanner;
public class rotateString {
    public static void Swap(char ch[],int start,int end){
        while(start<end){
             char temp=ch[start];
             ch[start]=ch[end];
             ch[end]=temp;
             start++;
             end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int lrotatenum=sc.nextInt();
        int rightRotate=s.length()-lrotatenum;
        char rotateside=sc.next().charAt(0);
        if(rotateside=='L'){
           Swap(ch,0,lrotatenum-1);
           Swap(ch, lrotatenum,ch.length-1);
           Swap(ch, 0, ch.length-1);
        }else{
           Swap(ch,0,rightRotate-1);
           Swap(ch, rightRotate,ch.length-1);
           Swap(ch, 0, ch.length-1);
        }
        int count=0;
        for(char c:ch){
            if(count<lrotatenum){ 
            if(c>='a' && c<='z'){
                count++;
            System.out.print((char)(c-32));
            }else if(c>='A' && c<='Z'){
                count++;
                System.out.print((char)(c+32));
            }
            }else{
                System.out.print(c);
            }
        }

    }
}
