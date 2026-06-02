import java.util.Scanner;

public class ReplaceNodeAtGivenPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ListDD head=null;
        ListDD tail=null;
        String str[]=sc.nextLine().split(" ");
        for(String st:str){
            ListDD node=new ListDD(Integer.parseInt(st));
            if(head==null){
               head=tail=node;
            }else{
               tail.next=node;
               node.prev=tail;
               tail=tail.next;
            }
        }
        System.out.println("enter Postion");
        int num=sc.nextInt();
        System.out.println("enter the value");
        int data=sc.nextInt();

        ListDD temp=head;
        for(int i=1;i<num;i++){
             temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position Not available");
        }else{
            temp.val=data;
            ListDD temp2=head;
            while(temp2!=null){
                System.out.println(temp2.val+" ");
                temp2=temp2.next;
            }
        }

    }
}
