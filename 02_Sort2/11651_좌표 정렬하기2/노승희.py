# 언어 : Python , (성공/실패) : 1/1, 메모리 : 51900 KB , 시간 : 332 ms
import sys
input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
  x, y = map(int, input().rstrip().split())
  arr.append((x, y))

arr.sort(key = lambda x :(x[1], x[0]))

for i in arr:
  print(i[0], i[1])