# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 48 ms
C,N = map(int,input().split())
cost_list = [list(map(int,input().split())) for _ in range(N)]
dp = [1e7 for _ in range(C+100)]
dp[0]=0
 
for cost, num_people in cost_list:
    for i in range(num_people,C+100):
        dp[i] = min(dp[i-num_people]+cost,dp[i])
 
print(min(dp[C:]))