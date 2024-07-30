# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31252 KB , 시간 : 40 ms
n = int(input())

dp = [-1] * 1001

dp[1] = 1 # SK
dp[2] = 0 # CY
dp[3] = 1 # SK

for i in range(4, n+1):
    if dp[i-1] == 1 or dp[i-3] == 1: 
        dp[i] = 0
    else:
        dp[i] = 1

if dp[n] == 1:
    print("SK")

else:
    print("CY")

# 1이면 상근이가 이김
# 0이면 창영이가 이김