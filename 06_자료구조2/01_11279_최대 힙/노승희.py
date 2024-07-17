# 언어 : Python , (성공/실패) : 1/0, 메모리 : 46260 KB , 시간 : 156 ms
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
      maxItem = heapq.heappop(heap)[1]
      print(maxItem)
  else:
    heapq.heappush(heap, (-x, x))
    
'''
N = int(input())
heap = []

for _ in range(N): 
  x = int(input())
  if x == 0: # 배열에서 가장 큰 값을 출력하고, 배열에서 제거해야 함.
    if not heap: # 만약 배열이 비어있다면
      print(0) # 0 출력
    else:
      maxItem = heapq.heappop(heap)[1] # 배열에서 가장 큰 값을 제거하고
      print(maxItem) # 해당 값 출력
  else: # 자연수라면
    heapq.heappush(heap, (-x, x)) # x라는 값을 추가하는 연산 실행
'''