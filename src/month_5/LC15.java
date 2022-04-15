package month_5;


import org.omg.PortableInterceptor.INACTIVE;

public class LC15 {
    /*static  int best = Integer.MAX_VALUE;
    public static  int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        for (int baseCost : baseCosts) {
            dfs(toppingCosts,target,baseCost,0);
        }
        return best;
    }

    private static void dfs(int[] toppingCosts, int target, int temp, int index) {

        if(Math.abs(best-target)>Math.abs(temp-target)) best = temp;

        if(index==toppingCosts.length||temp>=target) return;

        for (int k = 0; k < 3; k++) {
            dfs(toppingCosts, target ,temp + toppingCosts[index] * k,index + 1);
        }

    }*/


    private int res = Integer.MAX_VALUE;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        //取每个基础原料
        for (int baseCost : baseCosts) {
            dfs(toppingCosts, 0, baseCost, target);
        }
        return res;
    }
    private void dfs(int[] toppingCosts, int idx, int temp, int target) {
        //这个设置一个x的主要原因是有一个测试用例 target是10，给的条件可以达到11和9
        //如果不讨论的话，会通过不了
        int x = Math.abs(res - target) - Math.abs(temp - target);
        if (x > 0 || x == 0 && temp < res) res = temp;
        //当已经大于的时候，没有必要再讨论 只讨论小于和第一次大于之间的情况
        if (temp >= target || idx == toppingCosts.length) return;
        //添加零次一次两次
        dfs(toppingCosts, idx + 1, temp, target);
        dfs(toppingCosts, idx + 1, temp + toppingCosts[idx], target);
        dfs(toppingCosts, idx + 1, temp + toppingCosts[idx] * 2, target);
    }
}
