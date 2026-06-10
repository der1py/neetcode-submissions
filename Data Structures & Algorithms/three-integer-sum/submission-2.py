class Solution:
    def noRepeatedIndex(self, p, nd) -> bool:
        target = 0 - p[0] - p[1]
        i = p[2]
        j = p[3]

        if len(nd[target]) > 2: return True
        return not (i in nd[target] or j in nd[target])

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        used = set()
        nums_dict = {}
        pairs = []

        # make dict
        for i in range(len(nums)):
            if nums[i] in nums_dict:
                nums_dict[nums[i]].append(i)
            else:
                nums_dict[nums[i]] = [i]
        
        # make all values a set
        for i in range(len(nums)):
            nums_dict[nums[i]] = set(nums_dict[nums[i]])

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                # track indices here, theres prob a cleaner way
                pairs.append([nums[i], nums[j], i, j])
        
        for p in pairs:
            if (0 - p[0] - p[1]) in nums_dict and self.noRepeatedIndex(p, nums_dict):
                temp = [p[0], p[1], 0 - p[0] - p[1]]
                temp.sort()
                if (temp[0], temp[1], temp[2]) not in used:
                    ans.append(temp)
                    used.add((temp[0], temp[1], temp[2]))
        
        return ans
        