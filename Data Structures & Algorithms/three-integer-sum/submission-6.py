class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        for i in range(len(nums)):
            if nums[i] > 0: break # cuz all past this point r positive so cant possible sum to 0
            if i > 0 and nums[i] == nums[i - 1]: continue # avoid duplicates
            l = i + 1
            r = len(nums) - 1
            
            while (l < r):

                if l > i + 1 and nums[l] == nums[l - 1]: 
                    l += 1
                    continue
                # if r > i + 1 and nums[r] == nums[r - 1]:
                #     r -= 1
                #     continue

                sum = nums[i] + nums[l] + nums[r]
                if sum == 0:
                    res.append([nums[i], nums[l], nums[r]])
                    # if the sum is zero, u have to increase and decrease one element
                    l += 1
                    r -= 1
                elif sum < 0:
                    l += 1
                else:
                    r -= 1

        return res