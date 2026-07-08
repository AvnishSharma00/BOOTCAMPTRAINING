import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
import java.util.Stack;

class ListNode{
      int val;
      ListNode next;
      ListNode(int val){
        this.val=val;
      }
}
public class AddTwoNumberLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ListNode head1=null;
        ListNode tail1=null;
        System.out.println("Enter Number of element in list one");
        int num=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<num;i++){
            ListNode node=new ListNode(sc.nextInt());
            if(head1==null){
               head1=tail1=node;
            }else{
                tail1.next=node;
                tail1=node;
            }
        }
         ListNode head2=null;
        ListNode tail2=null;
        System.out.println("Enter Number of element in list two");
        int num1=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<num1;i++){
            ListNode node=new ListNode(sc.nextInt());
            if(head2==null){
               head2=tail2=node;
            }else{
                tail2.next=node;
                tail2=node;
            }
        }
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        while(head1!=null){
             st1.push(head1.val);
             head1=head1.next;
        }
         while(head2!=null){
             st2.push(head2.val);
             head2=head2.next;
        }
        int carry=0;
        ListNode dummy=null;
        while(!st1.isEmpty() || !st2.isEmpty() || carry!=0){
            int sum=carry;
            if(!st1.isEmpty()){
                sum+=st1.pop();
            }
              if(!st2.isEmpty()){
                sum+=st2.pop();
            }
            carry=sum/10;
            ListNode node1=new ListNode(sum%10);
            node1.next=dummy;
            dummy=node1;
        }
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy=dummy.next;
        }

    }
}
