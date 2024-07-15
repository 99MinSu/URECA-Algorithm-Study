# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 36 ms
import sys
input = sys.stdin.readline

N, K = map(int, input().rstrip().split())
arr = [i for i in range(1, N+1)]
erased = []

idx = 0

for i in range(N):
  idx += K-1

  if idx >= len(arr):
    idx %= len(arr)
  erased.append(str(arr.pop(idx)))

print('<',', '.join(erased),'>', sep='')