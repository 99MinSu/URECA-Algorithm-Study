# 언어 : Python , (성공/실패) : 1/0, 메모리 : 37044 KB , 시간 : 120 ms
import sys
import heapq
input = sys.stdin.readline

N = int(input())
heap = []

for _ in range(N):
  x = int(input())
  if x == 0:
    if not heap:
      print(0)
    else:
      minItem = heapq.heappop(heap)
      print(minItem)
  else:
    heapq.heappush(heap, x)