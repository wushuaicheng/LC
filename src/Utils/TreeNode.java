package Utils;

import month_5.LC19;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }
    public TreeNode() { }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
    public void first() {
        System.out.println(this.val);
        if(this.left!=null) this.left.first();
        if(this.right!=null) this.right.first();
    }
}
