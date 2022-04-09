package month_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        lists.add(list);
        lists.add(new LinkedList<>(list));
        for (List<Integer> integers : lists) {
            System.out.println(list);
        }




    }
}
