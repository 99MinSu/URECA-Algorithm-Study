# 언어 : Python , (성공/실패) : 1/0, 메모리 : 175116 KB , 시간 : 1384 ms
import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
dq = deque()

for _ in range(N):
  cmd = input().rstrip().split()
  c = cmd[0]

  if c == 'push':
    dq.append(cmd[1])
  elif c == 'pop':
    if not dq: print(-1)
    else:
      print(dq.popleft())
  elif c == 'size':
    print(len(dq))
  elif c == 'empty':
    if not dq: print(1)
    else: print(0)
  elif c == 'front':
    if not dq: print(-1)
    else:
      print(dq[0])
  elif c == 'back':
    if not dq: print(-1)
    else:
      print(dq[-1])
  