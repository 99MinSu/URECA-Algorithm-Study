# 언어 : Python , (성공/실패) : 1/0, 메모리 : 46628 KB , 시간 : 392 ms
import sys
input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
  x, y = map(int, input().rstrip().split())
  arr.append([x, y])

# sort 메서드는 기본적으로 첫 번째 요소를 기준으로 정렬하기 때문에 굳이 정렬 기준을 주지 않고 정렬함.
# 첫번째 요소인 x를 기준으로 정렬하고, 첫번째 요소가 같다면 두 번째 요소를 기준으로 정렬함.
arr.sort()

for i in arr:
  print(i[0], i[1]) # x, y 출력