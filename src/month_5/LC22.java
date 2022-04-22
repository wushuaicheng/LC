package month_5;

import Utils.TreeNode;
//1457. 二叉树中的伪回文路径
public class LC22 {
    /*int res = 0;
    public  int pseudoPalindromicPaths (TreeNode root) {
        int temp = 0;
        dfs(root,new ArrayList<Integer>(),temp);
        return res;
    }
    private  void dfs(TreeNode root, List<Integer> list, int temp) {
        list.add(root.val);
        //如果是叶子节点，则结束添加，开始判断
        if(root.left==null&&root.right==null){
            temp = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (Integer integer : list) {
                map.put(integer,map.getOrDefault(integer,0)+1);
            }
            //回文中只允许出现一个为奇数的元素
            for(Map.Entry entry:map.entrySet()){
                if(((Integer)entry.getValue()%2)!=0) temp++;
            }
            if(temp<=1) res++;
            list.remove((Object)root.val);
            return;
        }
        //递归
        if(root.left!=null){
            dfs(root.left,list,temp);

        }
        if(root.right!=null){
            dfs(root.right,list,temp);
        }
        list.remove((Object)root.val);
        return;
    }

    */int res = 0;
    public  int pseudoPalindromicPaths (TreeNode root) {
        int temp = 0;
        int[] arr =new int[10];
        dfs(root,arr,temp);
        return res;
    }
    private void dfs(TreeNode root, int[] arr, int temp) {
        //由于val取值0到9，那么创建一个数组包含他们
        arr[root.val]++;
        if(root.left==null&&root.right==null){
            temp = 0;
            //和上面思路一样，只不过数组比list的开销小
            for (int i : arr) {
                if(i%2!=0) temp++;
            }
            if(temp<=1) res++;
            arr[root.val]--;
            return;
        }
        if(root.left!=null){
            dfs(root.left,arr,temp);
        }
        if(root.right!=null){
            dfs(root.right,arr,temp);
        }
        arr[root.val]--;
        return;
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(1);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node5.right=node6;
    }
}
