package month_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC08 {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> currMax = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int sumCurr = 0;
        int countCrr = 0;
        for(int i = 0; i< costs.length; i++) {
            if(coins >= sumCurr + costs[i]){ // 添加元素
                countCrr++;
                sumCurr += costs[i];
                currMax.add(costs[i]);
            } else {
                int maxItem = currMax.peek() != null ? currMax.peek():0;
                if(costs[i] < maxItem && coins >= sumCurr + costs[i] - maxItem) { // 置换元素
                    sumCurr += costs[i]- maxItem;
                    currMax.remove(maxItem);
                    currMax.add(costs[i]);
                }
            }
        }

        return countCrr;
    }
    public int maxIceCream1(int[] costs, int coins) {
        int res = 0;
        int sum = 0;
        PriorityQueue<Integer> objects = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int cost : costs) {
            if(sum+cost<=coins){
                sum+=cost;
                objects.add(cost);
                res++;
            }else {
                int max = (objects.peek()!=0)?objects.peek():0;
                if(cost<max&&sum-max+cost<=coins){
                    sum=sum-max+cost;
                    objects.remove(max);
                    objects.add(cost);
                }
            }
        }
        return res;
    }
}
