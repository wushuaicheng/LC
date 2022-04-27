package month_6;



import Utils.TreeNode;
import java.util.*;
public class LC08 {
    //剑指 Offer 32 - II. 从上到下打印二叉树 II
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();

        q1.add(root);
        ArrayList<Integer> list = null;
        TreeNode temp = null;
        while (q1.size()!=0||q2.size()!=0){
            if(q1.size()!=0){
                list = new ArrayList<>();
                while (q1.peek()!=null){
                    temp=q1.poll();
                    list.add(temp.val);
                    if(temp.left!=null) q2.add(temp.left);
                    if(temp.right!=null)q2.add(temp.right);
                }
                res.add(new ArrayList<>(list));
            }else if (q2.size()!=0){
                list = new ArrayList<>();
                while (q2.peek()!=null){
                    temp=q2.poll();
                    list.add(temp.val);
                    if(temp.left!=null) q1.add(temp.left);
                    if(temp.right!=null) q1.add(temp.right);
                }
                res.add(new ArrayList<>(list));
            }
        }
        return res;
    }

}
