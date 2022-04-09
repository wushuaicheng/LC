package month_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//四数枝和
public class LC02 {
    public  static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return lists;
        }
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                System.out.println((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3]);
                System.out.println( nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3]);
                break;
            }
            System.out.println((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1]);
            System.out.println( nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1]);
            if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {

                continue;
            }
            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int left = j + 1;
                int right = nums.length - 1;
                if ((long)nums[i] + nums[j] + nums[left] + nums[left + 1] > target)
                    break;
                if ((long)nums[i] + nums[j] + nums[right - 1] + nums[right] < target)
                    continue;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }

                }

            }
        }
        return lists;
    }

    public static void main(String[] args) {
        /*int[] ints = {0,0,0,1000000000,1000000000,1000000000,1000000000};


        List<List<Integer>> lists = fourSum(ints, 1000000000);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }*/

        System.out.println(1000000000+1000000000+1000000000+0);
        System.out.println((long)1000000000+1000000000+1000000000+0);
    }
}
/*class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return quadruplets;
        }
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }
            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if ((long) nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
                    continue;
                }
                int left = j + 1, right = length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return quadruplets;
    }
}
。*/