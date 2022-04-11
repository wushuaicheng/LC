package month_5;

import Utils.TreeNode;

//面试题 04.04. 检查平衡性
public class LC05 {
   /* int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    public boolean isBalanced(TreeNode root) {
        balance(root,0);
        return (max-min)>=2?false:true;
    }

    private void balance(TreeNode root, int res) {
        if(root==null){
            if(res<min){
                min = res;
            }else if(res>max){
                max = res;
            }
        }else {
            balance(root.left,res+1);
            balance(root.right,res+1);
        }
    }

    public static void main(String[] args) {

    }*/

   /* Boolean res = true;
    public boolean isBalanced(TreeNode root) {
       balance(root);
       return res;
    }
    private int balance(TreeNode root) {
        if (root==null) return 0;
        int l = balance(root.left);
        int r = balance(root.right);
        if(Math.abs(l-r)>1) res = false;
        return Math.max(l,r)+1;

    }*/

}
