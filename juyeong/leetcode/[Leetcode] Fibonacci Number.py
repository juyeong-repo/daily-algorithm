class Solution:
    def fib(self, n: int) -> int:
        
        #base case
        if n == 0:
            return 0
        elif n == 1:
            return 1
        
        
        #recursive case
        return self.fib(n-1) + self.fib(n-2)