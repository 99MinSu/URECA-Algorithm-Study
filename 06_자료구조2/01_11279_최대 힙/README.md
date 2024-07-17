## 파이썬 힙 자료구조
### 힙큐(heapq)
**파이썬의 heapq 모듈은 최소 힙으로 구현되어 있음.**
- ```heapq.heappush(heap, item)``` : item을 heap에 추가
- ```heapq.heappop(heap)``` : heap에서 가장 작은 원소를 pop & 리턴. 비어 있는 경우 IndexError가 호출됨. 
- ```heapq.heapify(x)``` : 리스트 x를 즉각적으로 heap으로 변환함 (in linear time, O(N) )

#### 최대 힙 만들기
- 힙에 원소를 추가할 때 (-item, item)의 튜플 형태로 넣어주면 튜플의 첫 번째 원소를 우선순위로 힙을 구성하게 됨.
- 이때 원소 값의 부호를 바꿨기 때문에, 최소 힙으로 구현된 heapq 모듈을 최대 힙 구현에 활용

- ```heapq.heappush(max_heap, (-item, item))``` : (-item, item)의 튜플의 형태로 max_heap에 item 추가함.
- 결과로 heappop을 사용하게 되면 힙에 있는 최댓값이 반환됨
- 이때 실제 원소 값은 튜플의 두 번째 자리에 저장되어 있으므로 [1] 인덱싱을 통해 접근해야 함!