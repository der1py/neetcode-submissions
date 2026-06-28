class Solution:
    def trap(self, height: List[int]) -> int:
        prefix_max = [0] * len(height)
        suffix_max = [0] * len(height)
        area = 0

        max_h = 0
        for i in range(len(height)):
            max_h = max(max_h, height[i])
            prefix_max[i] = max_h
        
        max_h = 0
        for i in reversed(range(len(height))):
            max_h = max(max_h, height[i])
            suffix_max[i] = max_h

        for i in range(len(height)):
            area += min(suffix_max[i], prefix_max[i]) - height[i]
        
        return area