class Solution {
    public int longestConsecutive(int[] nums) {
        // val is js a placeholder
        HashMap<Integer, Boolean> numsMap = new HashMap<Integer, Boolean>();
        for (int i : nums) {
            numsMap.put(i, true);
        }

        ArrayList<Integer> startVals = new ArrayList<>();
        for (int i : nums) {
            if (numsMap.get(i - 1) == null) startVals.add(i);
        }

        int max = 0;
        while (startVals.size() > 0) {
            int count = 1;
            int next = startVals.remove(0) + 1;

            while (numsMap.get(next) != null) {
                count++;
                next++;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
