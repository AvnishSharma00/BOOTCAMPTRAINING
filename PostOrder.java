import java.util.Scanner;

public class PostOrder {
    
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
       public static void postOrder(TreeNode root){
               if(root==null){
                return;
               }
               postOrder(root.left);
               postOrder(root.right);
                System.out.println(root.val);
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        TreeNode root=null;

        for(int i=0;i<num;i++){
                root=insert(sc.nextInt(),root);
        }
        postOrder(root);
        sc.close();
    }
}
