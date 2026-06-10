import java.util.Scanner;

public class BalancedTree {
    public static TreeNode insert(int data,TreeNode root){
              if(root==null){
                  return new TreeNode(data);
              }
              if(data<root.val){
                 root.left= insert(data, root.left);
              }
              if(data>root.val){
                root.right=  insert(data, root.right);
              }
              return root;
       }
       public static int isBalancedTree(TreeNode root){
              if(root==null){
                return 0;
              }
              int left=isBalancedTree(root.left);
              if(left==-1){
                return -1;
              }
              int right=isBalancedTree(root.right);
              if(right==-1)return-1;
              if(Math.abs(left-right)>1)return -1;
              return Math.max(left, right)+1;
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element in tree ");
        int num=sc.nextInt();
        TreeNode root1=null;
        System.out.println("ENter ELements in tree");
        for(int i=0;i<num;i++){
                root1=insert(sc.nextInt(),root1);
        }
       int ans= isBalancedTree(root1);
       if(ans==-1){
        System.out.println("Unbalanced");
       }else{
        System.out.println("Balanced");
       }
    }
}
