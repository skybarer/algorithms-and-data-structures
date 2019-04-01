package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 12:06 PM
 */
class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{0,-4,-1,-4,-2,-3,2};
        Solution solution = new Solution();
        System.out.println(solution.threeSum(arr));
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> pair = new ArrayList<>();
        TreeSet<String> set = new TreeSet<String>();
        List<Integer> triplets = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - i; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        String str = nums[i] + ":" + nums[j] + ":" + nums[k];
                        if (!set.contains(str)) {
                            // To check for the unique triplet
                            triplets.add(nums[i]);
                            triplets.add(nums[j]);
                            triplets.add(nums[k]);
                            pair.add(triplets);
                            triplets = new ArrayList<>();
                            set.add(str);
                        }
                    }

                }
            }
        }
        return pair;
    }
}
