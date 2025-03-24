package F3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int size = nums.length;
        Set<Integer> list = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        for(int i = 1; i <= size; i++) {
            if(!(list.contains(i))){
                result.add(i);
                System.out.println(i);
            }
        }
        return result;
    }
}
