import sys
input = sys.stdin.readline

N = int(input().strip())

for _ in range(N):
    n, m = map(int, input().split())
    dy = [[0 for _ in range(m + 1)] for _ in range(n + 1)]
    
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            if i == 1:
                dy[i][j] = j
            elif i == j:
                dy[i][j] = 1
            else:
                if j > i:
                    dy[i][j] = dy[i][j - 1] + dy[i - 1][j - 1]
                    
    print(dy[n][m])
