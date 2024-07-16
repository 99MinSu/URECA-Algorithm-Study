from collections import deque 
import sys
input = sys.stdin.readline

d = deque()
n = int(input())  # 명령어의 개수를 입력받음

for _ in range(n):
    command = input().split()
    if command[0] == 'push':
        d.append(int(command[1]))
    elif command[0] == 'pop':
        if d:
            print(d.popleft())
        else:
            print("-1")
    elif command[0] == 'size':
        print(len(d))
    elif command[0] == 'empty':
        if d:
            print("0")
        else:
            print("1")
    elif command[0] == "front":
        if d:
            print(d[0])
        else:
            print("-1")
    elif command[0] == "back":
        if d:
            print(d[-1])
        else:
            print("-1")
