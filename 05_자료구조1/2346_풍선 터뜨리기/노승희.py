# 언어 : Python , (성공/실패) : 1/0, 메모리 : 34016 KB , 시간 : 60 ms
import sys
from collections import deque

n = int(sys.stdin.readline())

deq = deque(enumerate(map(int, sys.stdin.readline().split()), start=1))

for i in range(n):
    p = deq.popleft()
    print(p[0], end=' ')
    if p[1] > 0:
        deq.rotate(-(p[1] - 1))
    else:
        deq.rotate(-p[1])