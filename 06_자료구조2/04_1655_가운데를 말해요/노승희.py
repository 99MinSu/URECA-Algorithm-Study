# 언어 : Python , (성공/실패) : 1/3, 메모리 : 37132 KB , 시간 : 252 ms
import sys
import heapq
input = sys.stdin.readline

N = int(input())
leftHeap = [] # 최대힙 구현 (중간 값은 항상 leftHeap의 제일 큰 값으로 둠)
rightHeap = [] # 최소힙 구현

for _ in range(N):
  x = int(input())

  # leftHeap이 비었거나, x가 중간 값보다 작으면
  if len(leftHeap) == 0 or -leftHeap[0] >= x:
    heapq.heappush(leftHeap, -x) # x를 왼쪽에
  else:
    heapq.heappush(rightHeap, x)

  if len(leftHeap) > len(rightHeap) + 1: # 두 힙의 길이 차이가 1이상 난다면(왼쪽이 더 길 경우)
    temp = -heapq.heappop(leftHeap) # 왼쪽의 최댓값을 뽑아서 
    heapq.heappush(rightHeap, temp) # 오른쪽에 넣음
  elif len(rightHeap) > len(leftHeap): # 오른쪽이 더 길 경우
    temp = heapq.heappop(rightHeap) # 오른쪽의 최솟값을 뽑아서
    heapq.heappush(leftHeap, -temp) # 왼쪽에 넣음.
  
  print(-leftHeap[0]) # 왼쪽 힙의 최댓값이 항상 중간값