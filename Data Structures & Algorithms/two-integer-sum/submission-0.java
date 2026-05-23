class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffToIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (diffToIdx.get(target - nums[i]) != null) {
                return new int[] {diffToIdx.get(target - nums[i]), i};
            }
            diffToIdx.put(nums[i], i);
        }

        return null;
    }
}
