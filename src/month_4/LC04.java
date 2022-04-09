package month_4;

import Utils.TreeNode;

import java.util.LinkedList;
import java.util.List;
//113 路径总和 II
public class LC04 {



    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum , 0 , new LinkedList<Integer>());
        return res;
    }

    public void dfs(TreeNode root, int targetSum , int sum , LinkedList<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null && sum+root.val == targetSum) {

            res.add(new LinkedList<>(list));
        }
        dfs(root.left, targetSum , sum+root.val,list);
        dfs(root.right, targetSum ,sum+root.val,list);
        list.removeLast();

    }



}
