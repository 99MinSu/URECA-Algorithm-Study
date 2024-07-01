# 언어 : Python , (성공/실패) : 1/6 , 메모리 : 31120 KB , 시간 : 7908 ms
import sys
input = sys.stdin.readline

N = int(input())

arr = [0] * 10001

# 입력받은 숫자의 빈도 증가
for _ in range(N):
  num = int(input())
  arr[num] += 1

# 배열을 순회하며 빈도 수만큼 숫자 출력
for i in range(10001):
  if arr[i] != 0:
    for j in range(arr[i]):
      print(i)

# 카운팅 정렬 > 입력데이터 범위가 한정된 경우에 효율적