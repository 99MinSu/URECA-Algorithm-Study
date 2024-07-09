# 언어 : Python , (성공/실패) : 1/3, 메모리 : 109240 KB , 시간 : 1276 ms
import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().rstrip().split()))

for i in range(1, min(arr)+1):
  flag = True
  for num in arr:
    if  num % i != 0:
      flag = False
      break
  if flag:
    print(i)