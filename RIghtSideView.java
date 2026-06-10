import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RIghtSideView {
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
       public static void rightSide(TreeNode root,int level,List<Integer> ans){
                     if(root==null){
                        return;
                     }
                     if(level==ans.size()){
                        ans.add(root.val);
                     }
                     rightSide(root.right, level+1, ans);
                     rightSide(root.left, level+1, ans);

       }

       public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        TreeNode root=null;

        for(int i=0;i<num;i++){
                root=insert(sc.nextInt(),root);
        }
        List<Integer> ans=new ArrayList<>();
        rightSide(root, 0, ans);
        System.out.println(ans);
       }
}
