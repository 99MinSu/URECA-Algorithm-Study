import heapq
import sys

input = sys.stdin.read
def max_heap():
    data = input().split()
    N = int(data[0])
    operations = list(map(int, data[1:]))
    
    max_heap = []
    
    for x in operations:
        if x == 0:
            if max_heap:
                print(-heapq.heappop(max_heap))
            else:
                print(0)
        else:
            heapq.heappush(max_heap, -x)

max_heap()
