package month_4;
//全排列

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LC20 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int length = nums.length;

        rebacl(res,list,0,length);
        return res;

    }

    private void rebacl(List<List<Integer>> res, ArrayList<Integer> list, int first, int length) {
        if(first==length){
            res.add(new ArrayList<>(list));
        }
        for (int i = first; i < length; i++) {
            Collections.swap(list,first,i);
            rebacl(res,list,first+1,length);
            Collections.swap(list,first,i);
        }
    }


}
