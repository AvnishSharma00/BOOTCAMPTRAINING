import java.util.Scanner;

class ListNode{
      int val;
      ListNode next;
      ListNode(int val){
        this.val=val;
      }
}
public class LinkedListCountELement {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str[]=sc.nextLine().split(" ");
       ListNode head=null;
       ListNode tail=null;
       for(String str1:str){
           ListNode node=new ListNode(Integer.parseInt(str1));
           if(head==null){
              head=tail=node;
           }else{
            tail.next=node;
            tail=tail.next;
           }
       }
       int count=0;
       ListNode temp=head;
       while(temp!=null){
             count++;
             temp=temp.next;
       }
       System.out.println(count);
    }
       
}
