package month_6;

import Utils.ListNode;
import Utils.TreeNode;

import javax.print.DocFlavor;
import java.util.LinkedList;
import java.util.List;



public class LC05 {
    public static List<TreeNode> generateTrees(int n) {
       if(n<1) return null;
       return findTree(1,n);
    }

    private static List<TreeNode> findTree(int start, int end) {

        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        if (start>end){
            treeNodes.add(null);
            return treeNodes;
        }
        for (int i = start; i <= end ; i++) {
            List<TreeNode> left = findTree(start, i - 1);
            List<TreeNode> right = findTree(i + 1, end);
            for (TreeNode node : left) {
                for (TreeNode treeNode : right) {
                    TreeNode root = new TreeNode(i);
                    root.left=node;
                    root.right=treeNode;
                    treeNodes.add(root);
                }
            }
        }
        return treeNodes;
    }

    public static void main(String[] args) {
        System.out.println(generateTrees(3));
    }


}
