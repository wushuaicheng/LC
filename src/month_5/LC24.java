package month_5;

import Utils.TreeNode;


//222. 完全二叉树的节点个数
public class LC24 {
    /*static int res;
    public static int countNodes(TreeNode root) {
        if(root==null) return 0;
        int num = 0;
        TreeNode head = root;
        while (head!=null){
            num++;
            head= head.left;
        }
        dfs(root,num);
        if(res == Math.pow(2,num)) return (int)Math.pow(2,num)-1;
        return (int)Math.pow(2,num)-1-res;
    }

    private static void dfs(TreeNode root,int num) {
        if(num>2){
            dfs(root.right, num-1);
            dfs(root.left, num-1);
        }
        if(root.right==null) res++;
        if(root.left==null) res++;
    }*/
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int l = gethight(root.left);
        int r = gethight(root.right);
        if(l==r) return (1<<l)+countNodes(root.right);
        else return (1<<r)+countNodes(root.left);
    }

    private int gethight(TreeNode root) {
        int high = 0;
        while (root!=null){
            root=root.left;
            high++;
        }
        return high;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);


    }


}
