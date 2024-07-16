# 언어 : Python , (성공/실패) : 1/3, 메모리 : 31120 KB , 시간 : 44 ms
import sys
input = sys.stdin.readline

N = int(input())
queue = []

for _ in range(N):
  cmd = input().rstrip().split()
  c = cmd[0]

  if c == 'push':
    queue.append(int(cmd[1]))
  elif c == 'pop':
    if not queue: print(-1)
    else:
      print(queue.pop(0))
  elif c == 'size':
    print(len(queue))
  elif c == 'empty':
    if not queue: print(1)
    else: print(0)
  elif c == 'front':
    if not queue: print(-1)
    else: print(queue[0])
  elif c == 'back':
    if not queue: print(-1)
    else: print(queue[-1])