import java.util.Scanner;

class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val){
              this.val=val;
      }
}
public class InorderTraversal {
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
       public static void inorder(TreeNode root){
               if(root==null){
                return;
               }
               inorder(root.left);
               System.out.println(root.val);
               inorder(root.right);
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        TreeNode root=null;

        for(int i=0;i<num;i++){
                root=insert(sc.nextInt(),root);
        }
        inorder(root);
        sc.close();
    }
}
