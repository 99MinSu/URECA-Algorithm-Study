#물품의 수 N
#버틸 수 있는 무게 K
#각 물건의 무게 W와 해당 물건의 가치 V

import sys

N, K = map(int, input().split())
stuff = [[0,0]]
knapsack = [[0 for _ in range(K + 1)] for _ in range(N + 1)] #무게랑 물품의 수를 (N+1) x (K+1) 크기를 0으로 초기화

for _ in range(N):
    stuff.append(list(map(int, input().split())))


#냅색 문제 풀이
for i in range(1, N + 1):
    for j in range(1, K + 1):
        weight = stuff[i][0] 
        value = stuff[i][1]
       
        if j < weight:
            knapsack[i][j] = knapsack[i - 1][j] #weight보다 작으면 위의 값을 그대로 가져온다
        else:
            knapsack[i][j] = max(value + knapsack[i - 1][j - weight], knapsack[i - 1][j])

print(knapsack[N][K])
