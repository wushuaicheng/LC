package month_5;

import Utils.TreeNode;

import javax.swing.*;

//437. 路径总和 III
public class LC04 {
    int ans;
    public int pathSum(TreeNode root, int _t) {

        if(root == null )return 0;
        find1(root,_t);
        return ans;
    }
    private  void find1(TreeNode root,int _t) {
        if(root==null) return;
         find2(root,root.val,_t);
         find1(root.left,_t);
         find1(root.right,_t);
    }

    private  void find2(TreeNode root, int val,int _t) {
        if(val==_t) ans++;
        if(root.left!=null) find2(root.left,val+root.left.val, _t);
        if(root.right!=null) find2(root.right,val+root.right.val, _t);
    }


}
