class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int prodNoZeroes = 1;
        int zeroes = 0;
        int[] output = new int[nums.length];

        for (int n : nums) {
            prod *= n;
            if (n != 0) prodNoZeroes *= n;
            else zeroes++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroes > 1) output[i] = 0;
            else if (nums[i] == 0) output[i] = prodNoZeroes;
            else output[i] = prod / nums[i];
        }

        return output;
    }
}  
