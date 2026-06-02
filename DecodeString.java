import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Integer> numberStack=new Stack<>();
        Stack<StringBuilder> stringStack=new Stack<>();
        StringBuilder current=new StringBuilder();
        int  num=0;
        for(char c:s.toCharArray()){
                 if(Character.isDigit(c)){
                    num=num*10+(c-'0');
                 }
                 else if(c=='['){
                    numberStack.push(num);
                    stringStack.push(current);
                    num=0;
                    current=new StringBuilder();
                 }else if(c==']'){
                    int repeat=numberStack.pop();
                    StringBuilder prev=stringStack.pop();
                    for(int i=0;i<repeat;i++){
                        prev.append(current);
                    }
                    current=prev;
                 }else{
                    current.append(c);
                 }
        }
        System.out.println(current.toString());
    }
}
