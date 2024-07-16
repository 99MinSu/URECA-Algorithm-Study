# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 36 ms
import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
  test = input()
  stack = []

  for t in test:
    if t == '(':
      stack.append(t)
    elif t == ')':
      if not stack:
        print('NO')
        break
      else:
        stack.pop()
    else:
      if not stack:
        print('YES')
      else:
        print('NO')