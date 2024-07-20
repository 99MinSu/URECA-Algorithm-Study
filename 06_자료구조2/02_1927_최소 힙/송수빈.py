import heapq
import sys

input = sys.stdin.read

def min_heap():
    data = input().split()
    N = int(data[0])
    operations = list(map(int, data[1:]))
    
    min_heap = []
    
    for x in operations:
        if x == 0:
            if min_heap:
                print(heapq.heappop(min_heap))
            else:
                print(0)
        else:
            heapq.heappush(min_heap, x)

min_heap()
