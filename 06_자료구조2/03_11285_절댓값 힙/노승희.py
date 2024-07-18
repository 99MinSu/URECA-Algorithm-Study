# 언어 : Python , (성공/실패) : 1/3, 메모리 : 39824 KB , 시간 : 152 ms
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
      # minItem = heapq.heappop(heap)
      # print(minItem[1])

      _, min_value = heapq.heappop(heap)
      print(min_value)
  else:
    # if x not in heap: # 원소를 추가할 때마다 중복 확인하는 과정 비효율
      heapq.heappush(heap, (abs(x), x)) # 튜플 사용하면 중복 값이 들어가지 않음을 보장

# 절댒값을 기준으로 최소 힙에 튜플 형태로 원소 추가 -> 절댓값이 작은 순서대로 정렬 됨
# 튜플을 꺼낼 때는 원래의 숫자 x를 출력