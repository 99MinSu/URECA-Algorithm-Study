#C명 = 늘리는 목표 명수 
#N = 도시의 개수(20보다 작음)

C, N =map(int,input().split()) #peop
data=[]
for i in range(N):
    v,p =map(int,input().split())
    data.append([v,p])

dp=[1e6]*(100+C) # 배열을 1e6 = 10^6으로 초기화
dp[0]=0 #초기 비용 0

for i,j in data:
    for k in range(1,100+C):
        if j<=k:
            dp[k]=min(dp[k],dp[k-j]+i)


print(min(dp[N:]))
