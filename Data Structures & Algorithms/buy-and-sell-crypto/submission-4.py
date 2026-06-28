class Solution:
    def maxProfit(self, prices: List[int]) -> int:   
        profit = 0
        min_price = prices[0]

        for i in range(1, len(prices)):
            current_price = prices[i]
            
            current_profit = current_price - min_price
            if current_profit > profit:
                profit = current_profit
                
            if current_price < min_price:
                min_price = current_price

        return profit