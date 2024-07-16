from collections import deque 
import sys
input = sys.stdin.readline

d = deque()
n = int(input()) #입력 받을 개수 

for i in range(n):
    command = input().split()
    
    if command[0] == 'push_front':
        d.appendleft(int(command[1]))
    elif command[0] == 'push_back':
        d.append(int(command[1]))
    elif command[0] == "pop_front":
        if d:
            print(d[0])
            d.popleft()
        else:
            print("-1")
    elif command[0] == "pop_back":
        if d:
            print(d[-1])
            d.pop()
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
