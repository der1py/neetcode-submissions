class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        // add 1 cuz index 0 not used
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
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

        for (int key : count.keySet()) {
            int c = count.get(key);
            ArrayList<Integer> temp = new ArrayList<>();
            if (bucket[c] == null) {
                temp.add(key);
                bucket[c] = temp;
            } else {
                temp = bucket[c];
                temp.add(key);
                bucket[c] = temp;
            }
        }

        int idx = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            while (bucket[i] != null && bucket[i].size() > 0) {
                ans[idx] = bucket[i].remove(bucket[i].size() - 1);
                idx++;
                if (idx >= ans.length) return ans;
            }
        }

        return ans;
    }
}
