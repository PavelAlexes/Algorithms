package F1;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int missingNumber(int[] nums) {

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        list.sort(Integer::compareTo);

        if (list.size() == 1) {
            return list.getFirst() + 1;
        } else if (list.size() == 2) {
            return list.get(1) + 1;
        }

        System.out.println(list);

        for (int i = 0; i < nums.length; i++) {
            if (i == list.get(i)) {
                continue;
            } else return list.get(i) - 1;

        }
        return 0;
    }
}
