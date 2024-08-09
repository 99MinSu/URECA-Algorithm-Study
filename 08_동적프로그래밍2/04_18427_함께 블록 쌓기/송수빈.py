import sys
input = sys.stdin.readline
MOD = 10007
N, M, H = map(int, input().split()) # N=학생수, M=가질 수 있는 최대 블록, # H = 높이
block_list = []
# N번 반복합니다.
for _ in range(N):
    line = input().split() 
    numbers = list(map(int, line))  
    numbers = [0] + numbers
    
    block_list.append(numbers)

dp = [[0]*(H+1) for _ in range(N+1)]
dp[0][0] = 1
for i in range(N) :
  for h in range(H+1) :
    if dp[i][h] :
      for j in block_list[i] :
        if h + j <= H :
          dp[i+1][h + j] = (dp[i][h] + dp[i+1][h + j] ) % MOD
        
print(dp[-1][-1])
