# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 36 ms
import sys
input = sys.stdin.readline

N = int(input())
res = N
cnt = 0

while True:
  a = N // 10
  b = N % 10
  c = (a + b) % 10
  N = (b * 10) + c

  cnt += 1
  if (res == N):
    break

print(cnt)