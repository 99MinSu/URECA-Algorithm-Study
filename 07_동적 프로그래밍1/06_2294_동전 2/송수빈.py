import sys

input = sys.stdin.read
li = input().split()
 
N = int(li[0]) #동전 수 
K = int(li[1]) #만들어야 하는 금액 
coins = list(map(int, li[2:N+2]))

dp = [sys.maxsize] * (K + 1)
dp[0] = 0
        
for coin in coins:
    for i in range(coin, K + 1):
        if dp[i - coin] != sys.maxsize:
            dp[i] = min(dp[i], dp[i - coin] + 1)
                
if dp[K] == sys.maxsize:
    print(-1)
else:
    print(dp[K])
