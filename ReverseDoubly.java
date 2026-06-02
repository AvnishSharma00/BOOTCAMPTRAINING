import java.util.Scanner;
class ListDD{
    int val;
    ListDD prev;
    ListDD next;
    ListDD(int val){
        this.val=val;
    }
}
public class ReverseDoubly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        ListDD head=null;
        ListDD tail=null;
        for(String st:str){
            ListDD node=new ListDD(Integer.parseInt(st));
            if(head==null){
               head=tail=node;
            }else{
                node.prev=tail;
                tail.next=node;
                tail=tail.next;
            }
        }
        ListDD temp=head;
        System.out.println("original order");
        do{
            System.out.print(temp.val+" ");
            temp=temp.next;
        }while(temp!=null);
        System.out.println();
        System.out.println("Reverse Order");
        do{
            System.out.print(tail.val+" ");
            tail=tail.prev;
        }while (tail!=null);
    }
}
