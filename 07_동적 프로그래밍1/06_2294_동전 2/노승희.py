# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 356 ms
from sys import stdin

n, k = map(int, stdin.readline().split())

li =[]

for i in range(n):
   li.append(int(stdin.readline().rstrip()))

dp = [10001] * (k+1)
dp[0] = 0

for num in li:
   for i in range(num, k+1):
       dp[i] = min(dp[i],dp[i-num]+1)
if dp[k] == 10001:
   print(-1)
else:
   print(dp[k])