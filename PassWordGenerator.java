import java.util.Scanner;

public class PassWordGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.next();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' '){
                break;
            }
            sb1.append(str.charAt(i));
        }
        int i=str.length()-1;
        while(str.charAt(i)==' '){
            i--;
        }
        for(int j=i;j>=0;j--){
              if(str.charAt(j)==' '){
                break;
            }
            sb2.append(str.charAt(j));
        }
        System.out.println(sb1+"_"+sb2.reverse()+str2);
        sc.close();
    }
}
