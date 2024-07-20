# 언어 : Python , (성공/실패) : 1/0, 메모리 : 34060 KB , 시간 : 64 ms
import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
dq = deque()

for _ in range(N):
  cmd = input().rstrip().split()
  c = cmd[0]

  if c == 'push_front':
    dq.appendleft(cmd[1])
  elif c == 'push_back':
    dq.append(cmd[1])
  elif c == 'pop_front':
    if not dq: print(-1)
    else:
      print(dq.popleft())
  elif c == 'pop_back':
    if not dq: print(-1)
    else:
      print(dq.pop())
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
  