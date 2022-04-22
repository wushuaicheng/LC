package month_5;

import Utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//101. 对称二叉树
public class LC19 {
    public boolean isSymmetric(TreeNode root) {
        if(root!=null);
        return check(root.left, root.right);
    }

    public boolean check(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        else if (l == null || r == null) return false;
        return l.val == r.val && check(l.left, r.right) && check(l.right, r.left);
    }

    public boolean isSymmetric1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()){
            TreeNode l = queue.poll();
            TreeNode r = queue.poll();
            if(l==null&&r==null) continue;
            else if(l==null||r==null||l.val!=r.val) return false;
            queue.add(l.left);
            queue.add(r.right);
            queue.add(l.right);
            queue.add(r.left);
        }
        return true;
    }



}
