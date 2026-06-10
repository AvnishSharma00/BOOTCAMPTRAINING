import java.util.Scanner;

public class MaximumDepth {
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
       public static int  maxDepth(TreeNode root){
              if(root==null){
                return 0;
              }
              return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
       }
       public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        TreeNode root=null;

        for(int i=0;i<num;i++){
                root=insert(sc.nextInt(),root);
        }
        System.out.println(maxDepth(root));
        sc.close();
       }
}
