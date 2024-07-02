# 언어 : Python , (성공/실패) : 1/0, 메모리 : 46628 KB , 시간 : 392 ms
import sys
input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
  x, y = map(int, input().rstrip().split())
  arr.append([x, y])

arr.sort()
for i in arr:
  print(i[0], i[1])