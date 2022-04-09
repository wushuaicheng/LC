package month_3;

import Utils.TreeNode;

import java.util.*;

public class LC19 {
    //257. 二叉树的所有路径
   /*
   优化高
   public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        dfs(root,"",list);
        return list;
    }

    private void dfs(TreeNode root, String s, ArrayList<String> list) {
       if(root!=null){
           StringBuffer stringBuffer = new StringBuffer(s);
           stringBuffer.append(root.val);
           if(root.left==null&&root.right==null){
               list.add(stringBuffer.toString());
           }else{
               stringBuffer.append("->");
               dfs(root.right,stringBuffer.toString(),list);
               dfs(root.left,stringBuffer.toString(),list);
           }
       }
    }
*/
    /*
    优化底
    ArrayList<String> strings = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
   public List<String> binaryTreePaths(TreeNode root) {
       dfs(root);
       return strings;
   }

    private void dfs(TreeNode root) {
        if(root==null) return;
        if(root.right==null&&root.left==null) {
            strings.add(stringBuilder.toString());
        }
        int length = stringBuilder.length();

        stringBuilder.append(root.val+"->");

        dfs(root.left);
        dfs(root.right);
        stringBuilder.delete(length,stringBuilder.length());

    }*/
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        if(root==null) return list;
        Queue<Object> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(root.val);
        while(!queue.isEmpty()){
            TreeNode node = (TreeNode) queue.poll();
            String path = (String) queue.poll();
            if(node.right==null&&node.left==null){
                list.add(path);
            }
            if(node.left!=null){
                queue.offer(node.left);
                queue.offer(path+"->"+node.left.val);
            }
            if(node.right!=null){
                queue.offer(node.right);
                queue.offer(path+"->"+node.right.val);
            }

        }
        return list;
    }

 /*   public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        //队列，节点和路径成对出现，路径就是从根节点到当前节点的路径
        Queue<Object> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root.val + "");
        while (!queue.isEmpty()) {
            TreeNode node = (TreeNode) queue.poll();
            String path = (String) queue.poll();
            //如果到叶子节点，说明找到了一条完整路径
            if (node.left == null && node.right == null) {
                res.add(path);
            }

            //右子节点不为空就把右子节点和路径存放到队列中
            if (node.right != null) {
                queue.add(node.right);
                queue.add(path + "->" + node.right.val);
            }

            //左子节点不为空就把左子节点和路径存放到队列中
            if (node.left != null) {
                queue.add(node.left);
                queue.add(path + "->" + node.left.val);
            }
        }
        return res;
    }*/
}
