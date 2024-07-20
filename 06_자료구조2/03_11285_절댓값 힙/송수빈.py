import heapq
import sys

input = sys.stdin.read

def abs_heap():
    heap = []
    data = input().strip().split()
    N = int(data[0])
    operations = list(map(int, data[1:]))
    
    result = []
    
    for x in operations:
        if x == 0:
            if heap:
                # 힙에서 절댓값이 가장 작은 원소를 꺼내어 출력
                abs_val, val = heapq.heappop(heap)
                result.append(str(val))
            else:
                # 힙이 비어있으면 0을 출력
                result.append('0')
        else:
            # 힙에 (절댓값, 원래값) 형태로 원소 추가
            heapq.heappush(heap, (abs(x), x))
 
    sys.stdout.write("\n".join(result) + "\n")

abs_heap()
