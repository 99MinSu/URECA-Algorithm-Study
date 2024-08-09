N, K = map(int, input().split())
wv = []
for _ in range(N):
    w, v = map(int, input().split())
    wv.append((w, v))

dp = [0] * (K+1)
ans = 0
for w, v in wv:
    tmp = dp.copy()
    for k in range(K+1):
        if dp[k] and k + w <= K and dp[k+w] < tmp[k] + v:
            dp[k+w] = tmp[k] + v
    if w <= K:
        dp[w] = max(dp[w], v)

print(max(dp))