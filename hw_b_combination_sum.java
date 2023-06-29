import java.util.ArrayList;
import java.util.List;

public class hw_b_combination_sum {
    private static void getcomb(int[] nums, int i, int t, List<Integer> cur,
            List<List<Integer>> res) {
        if (t == 0) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        if (t < 0 || i >= nums.length)
            return;
        for (int k = i; k < nums.length; k++) {
            cur.add(nums[k]);

            getcomb(nums, k, t - nums[k], cur, res);
            cur.remove(cur.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        getcomb(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        List<List<Integer>> res = combinationSum(candidates, 7);
        System.out.println(res);
    }

}
