package NEW_5;

import java.util.HashMap;

public class LC15 {
    //1658. 将 x 减到 0 的最小操作数
    public static int minOperations1(int[] nums, int x) {
        int res = 0;
        int sum = 0;
        //取和进行判断
        for (int num : nums) {
            sum += num;
        }
        if (sum < x) return -1;
        else if (sum == x) return nums.length;
        else {
            //得到想要的K值
            int k = sum - x;
            int temp = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            //进行简单的前缀和运算
            for (int i = 0; i < nums.length; i++) {
                temp += nums[i];
                if (map.containsKey(temp-k)) res = Math.max(res, i - map.get(temp-k));
                map.put(temp, i);
            }
        }
        return res==0?-1:nums.length-res;
    }

    public int minOperations(int[] nums, int x) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int temp = 0;
        int res = 0;
        //取和进行判断
        for (int num : nums) {
            sum += num;
        }
        if (sum < x) return -1;
        else if (sum == x) return nums.length;
        else {
            //滑动窗口
            int k = sum -x ;
            for (right = 0; right < nums.length ; right++) {
                temp += nums[right];
                while (temp>k){
                    temp-=nums[left];
                    left++;
                }
                //取最大值
                if(temp==k) res = Math.max(res,right-left+1);
            }
        }
        return res==0?-1:nums.length-res;
    }

  

    //183. 从不订购的客户
    //子查询
   //SELECT Name Customers from Customers where Id not in (SELECT CustomerId from Orders);
    //左连接NULL
   //SELECT c.name Customers from Customers c left JOIN Orders o on o.CustomerId = c.Id where o.id is null


}



