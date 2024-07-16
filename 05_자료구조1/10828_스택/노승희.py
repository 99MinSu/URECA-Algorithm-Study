# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31252 KB , 시간 : 44 ms
import sys
input = sys.stdin.readline

N = int(input()) # 명령의 수
arr = []

for i in range(N):
  cmd = input().split()

  if cmd[0] == 'push':
    arr.append(cmd[1])

  elif cmd[0] == 'pop':
    if not arr:
      print(-1)
    else: 
      print(arr.pop())

  elif cmd[0] == 'size':
    print(len(arr))

  elif cmd[0] == 'empty':
    if not arr:
      print(1)
    else: 
      print(0)

  elif cmd[0] == 'top':
    if not arr:
      print(-1)
    else:
      print(arr[-1])