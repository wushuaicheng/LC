package month_4;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC17 {
    /*public static Map<Integer, List<TreeNode>> hashMap = null;
    public List<TreeNode> allPossibleFBT(int n) {
        hashMap = new HashMap<>();
        return build(n);
    }

    private List<TreeNode> build(int n) {
        List<TreeNode> list = new ArrayList<>();
        if (n == 1) {
            list.add(new TreeNode(0));
            return list;
        }
        for (int i = 1; i < n; i += 2) {
            List<TreeNode> left ;
            List<TreeNode> right ;
            if(hashMap.containsKey(i)){
                left=hashMap.get(i);
            }else {
                left=build(i);
            }
            if(hashMap.containsKey(n - i - 1)){
                right=hashMap.get(n - i - 1);
            }else {
                right=build(n - i - 1);
            }
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode curRoot = new TreeNode(0);
                    curRoot.left = l;
                    curRoot.right = r;
                    list.add(curRoot);

                }
            }
        }
        hashMap.put(n, list);
        return list;
    }*/
    public static Map<Integer,List<TreeNode>> hashmap = null;
    public List<TreeNode> allPossibleFBT(int n) {
        hashmap=new HashMap<>();
        return build(n);
    }

    private List<TreeNode> build(int n) {
        ArrayList<TreeNode> list = new ArrayList<>();
        if(n==1){
            list.add(new TreeNode(0));
            return list;
        }
        for (int i = 1; i < n; i+=2) {
            List<TreeNode> l ;
            List<TreeNode> r ;

            if(hashmap.containsKey(i)){
                l=hashmap.get(i);
            }else {
                l=build(i);
            }
            if(hashmap.containsKey(n-i-1)){
                r=hashmap.get(n-i-1);
            }else {
                r=build(n-i-1);
            }
            for (TreeNode left : l) {
                for (TreeNode right : r) {
                    TreeNode node = new TreeNode();
                    node.left=left;
                    node.right=right;
                    list.add(node);
                }
            }
        }
        hashmap.put(n,list);
        return list;
    }

}
