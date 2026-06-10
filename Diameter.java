import java.util.Scanner;

public class Diameter {
    public static int ans=0;
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
       public static int DiameterOfTree(TreeNode root){
              if(root==null){
                return 0;
              }
              int left=DiameterOfTree(root.left);
              int right=DiameterOfTree(root.right);
              ans=Math.max(ans,left+right);
              return Math.max(left,right)+1;
              
       }
    public static void main(String[] args) {
    
    
  Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        TreeNode root=null;
        for(int i=0;i<num;i++){
                root=insert(sc.nextInt(),root);
        }
        DiameterOfTree(root);
        System.out.println(ans);
    }
}
