package month_3;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
//前序遍历：打印 - 左 - 右
//中序遍历：左 - 打印 - 右
//后序遍历：左 - 右 - 打印
public class LC05 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        check(root,list);
        return list;

    }
    public List<Integer> check(TreeNode node,List<Integer> list){
        if(node==null) return list;
        check(node.left, list);
        list.add(node.val);
        check(node.right, list);
        return list;
    }
}
