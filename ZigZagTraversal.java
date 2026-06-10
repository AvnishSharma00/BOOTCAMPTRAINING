
    

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class ZigZagTraversal {

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
       public  static List<List<Integer>> LevelOrderZigZagTraversal(TreeNode root){
          List<List<Integer>> ans=new ArrayList<>();
              if(root==null){
                return ans;
              }
               boolean reverse=true;
              Queue<TreeNode> queue=new LinkedList<>();
              queue.add(root);
              while(!queue.isEmpty()){
                    List<Integer> result=new ArrayList<>();
                    int size=queue.size();
                    for(int i=0;i<size;i++){
                        TreeNode node=queue.poll();
                        result.add(node.val);
                        if(node.left!=null)queue.add(node.left);
                        if(node.right!=null)queue.add(node.right);
                    }
                    if(reverse==false){
                        Collections.reverse(result);
                    }
                    reverse=!reverse;
                    ans.add(result);

              }
              return ans;
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        TreeNode root=null;

        for(int i=0;i<num;i++){
                root=insert(sc.nextInt(),root);
        }
         List<List<Integer>> ans=LevelOrderZigZagTraversal(root);
         System.out.println(ans);
    }
}
