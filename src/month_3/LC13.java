package month_3;

import java.util.ArrayDeque;
import java.util.HashMap;

public class LC13 {
    //496. 下一个更大元素 I
   /* public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i ++){
            int j = 0 ;
            while (j<m&&nums1[i]!=nums2[j]) j++;
            while (j<m&&nums1[i]>=nums2[j]) j++;
            res[i] = j<m?nums2[j]:-1;
        }
        return res;

    }*/
   /*public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int m = nums2.length;
       ArrayDeque<Integer> deque = new ArrayDeque<>();
       HashMap<Integer, Integer> hashMap = new HashMap<>();
       for(int i = m-1 ; i >= 0 ; i ++){
           int num = nums2[i];
           while(!deque.isEmpty()&&num>=deque.peekLast()) deque.pollLast();
           hashMap.put(num,deque.isEmpty()?-1:deque.peekLast());
           deque.addLast(num);
       }
       int[] res = new int[n];
       for(int i = n-1 ; i >= 0 ; i ++){
           res[i] = hashMap.get(nums1[i]);
       }
       return res;
   }*/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = m -1 ; i >= 0 ; i--){
            int x = nums2[i];
            while (!deque.isEmpty()&&x>=deque.peekLast()) deque.pollLast();
            hashMap.put(x,deque.isEmpty()?-1:deque.peekLast());
            deque.addLast(x);
        }
        int[] ints = new int[n];
        for(int i = 0 ; i < n ; i ++){
            ints[i]=hashMap.get(nums1[i]);
        }
        return ints;
    }
}
