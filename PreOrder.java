import java.util.Scanner;
public class PreOrder {
     
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
       public static void preOrder(TreeNode root){
               if(root==null){
                return;
               }
               System.out.println(root.val);
               preOrder(root.left);
               preOrder(root.right);
                
       }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        TreeNode root=null;

        for(int i=0;i<num;i++){
                root=insert(sc.nextInt(),root);
        }
        preOrder(root);
        sc.close();
    }
}
