package month_4;

import Utils.TreeNode;

//112 路径总和
public class LC03 {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        return dfs(root,targetSum,0);

    }

    private boolean dfs(TreeNode root,  int targetSum,int sum) {

        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return (sum+root.val)==targetSum;
        }
        return dfs(root.left,targetSum,sum+root.val)|| dfs(root.right,targetSum,sum+root.val);
    }
}
