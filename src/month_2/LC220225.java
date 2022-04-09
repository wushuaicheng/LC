package month_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class   LC220225 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(list,res,candidates,target,0);
        return res;
    }
    public static void dfs(List<Integer> list , List<List<Integer>> res, int[] candidates , int target , int i){

        if(i==candidates.length) return;

        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }


        dfs(list,res,candidates,target,i+1);

        if(target - candidates[i] >= 0){
            list.add(candidates[i]);
            dfs(list,res,candidates,target-candidates[i],i);
            list.remove(list.size() - 1);
        }

    }




        public static void main(String[] args) {

            int[] a = new int[10];
            a[0] = 0;
            a[1] = 1;
            a[2] = 2;
            a[3] = 3;
            System.arraycopy(a, 2, a, 3, 3);
            a[2]=99;
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }



}
