class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = nums[i];

        for (int i : nums) {
            if (count.get(i) == null) {
                count.put(i, 1);
            } else {
                int temp = count.get(i);
                count.put(i, temp + 1);
            }
        }

        int idx = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int n : nums) {
                if (count.get(n) == i) {
                    ans[idx] = n;
                    count.put(n, -1);
                    if (idx == k - 1) return ans;
                    idx++;
                    i++;
                } 
            }
        }

        return ans;
    }
}
