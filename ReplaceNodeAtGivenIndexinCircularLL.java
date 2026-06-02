import java.util.Scanner;

public class ReplaceNodeAtGivenIndexinCircularLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ListNode head=null;
        ListNode tail=null;
        String[] str1=sc.nextLine().split(" ");
        for(String st:str1){
            ListNode node=new ListNode(Integer.parseInt(st));
            if(head==null){
               head=tail=node;
            }else{
                tail.next=node;
                tail=tail.next;
            }
        }
        tail.next=head;
        System.out.println("enter position");
        int pos=sc.nextInt();
        ListNode temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==head){
                break;
            }
        }
        if(temp==head){
            System.out.println("position not available");
        }else{
        temp.next=temp.next.next;
        ListNode temp1=head;
        do{
            System.out.println(temp1.val+" ");
            temp1=temp1.next;
        }while(temp1!=head);
    }  
    }
}
