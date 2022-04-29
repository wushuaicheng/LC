package month_6;

//42. 接雨水
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class LC16 {
    public static int trap1(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[i]>max){
                max=height[i];
            }
            left[i]=max;
        }
        max = 0;
        for (int i = height.length-1; i >=0; i--) {
            if(height[i]>max){
                max=height[i];
            }
            right[i]=max;
        }
        int res = 0;
        for (int i : left) res+=i;
        for (int i : right) res+=i;
        for (int i : height) res-=i;
        return res-max*height.length;
    }
    public int trap(int[] height) {
        int res = 0 , current = 0;
        Deque<Integer> stack = new LinkedList<>();
        int distance = 0;
        int dd = 0;
        while (current<height.length){
           while (!stack.isEmpty()&&height[current]>height[stack.peek()]){
               int top = stack.pop();
               if(stack.isEmpty()) break;
               distance = current - stack.peek() - 1;
               dd = Math.min(height[current],height[stack.peek()])-height[top];
               res+=dd*distance;
           }
           stack.push(current++);
       }
        return res;
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.push(1);
        System.out.println(deque.pop());
        System.out.println(deque);
    }

}
