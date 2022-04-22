package month_5;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LC29hefuman {
    public static void hefuman(){
        int[] arr = {2,4,8,1};
        ArrayList<TreeNode> list = new ArrayList<>();

        for (int i : arr) {
            list.add(new TreeNode(i));
        }

        while (list.size()>1){
            Collections.sort(list,((o1, o2) -> o1.val-o2.val));
            TreeNode node = list.get(0);
            TreeNode node1 = list.get(1);
            TreeNode node2 = new TreeNode(node.val + node1.val);
            node2.left=node;
            node2.right=node1;
            list.remove(node);
            list.remove(node1);
            list.add(node2);
        }
        TreeNode node = list.get(0);
        node.first();


    }
    public static void main(String[] args) {
        String s = "345101";
        String substring = s.substring(2, 4);
        System.out.println(substring);

    }
}
