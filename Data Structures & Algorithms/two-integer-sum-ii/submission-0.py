class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l = 0
        r = len(numbers) - 1

        while l < r:
            sum = numbers[l] + numbers[r]
            if sum == target:
                return [l + 1, r + 1]
            elif sum > target:
                r -= 1
            else:
                l += 1

        # l = left, r = right
        # while l < r
        # if l + r == targ return l,r
        # elif l + r > targ
        # we have to decrease r?
        # elif l + r < targ
        # we have to increase l?

        return None;
