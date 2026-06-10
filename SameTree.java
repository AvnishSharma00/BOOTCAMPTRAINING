import java.util.Scanner;

public class SameTree {
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
       public static boolean isSameTree(TreeNode p,TreeNode q){
              if(p==null && q==null){
                return true;
              }
              if(p==null || q==null){
                return false;
              }
              if(p.val!=q.val){
                return false;
              }
              return isSameTree(p.left, q.left)&& isSameTree(p.right, q.right);
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element in tree 1");
        int num=sc.nextInt();
        TreeNode root1=null;
        System.out.println("ENter ELements in tree1");
        for(int i=0;i<num;i++){
                root1=insert(sc.nextInt(),root1);
        }
         System.out.println("Enter number of element in tree 2");
        int num1=sc.nextInt();
        TreeNode root2=null;
        System.out.println("ENter ELements in tree2");
        for(int i=0;i<num1;i++){
                root2=insert(sc.nextInt(),root2);
        }
        System.out.println("Is both tree Same");
        System.out.println(isSameTree(root1, root2));

    }
}
