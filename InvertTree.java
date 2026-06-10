import java.util.Scanner;

public class InvertTree {
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
       public static void invertTree(TreeNode root){
               if(root==null){
                return;
               }
               TreeNode temp=root.left;
               root.left=root.right;
               root.right=temp;
               invertTree(root.left);
               invertTree(root.right);
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
        invertTree(root);
        inorder(root);
        sc.close();
       }
}
