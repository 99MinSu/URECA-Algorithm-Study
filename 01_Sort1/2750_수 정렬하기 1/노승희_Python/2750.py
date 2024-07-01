# 언어 : Python , (성공/실패) : 1/3 , 메모리 : 38548 KB , 시간 : 96 ms
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

N = int(input())
arr = []

for i in range(N):
  arr.append(int(input()))

# 퀵 정렬
def quick_sort(arr):
  if len(arr) <= 1:
    return arr
  
  pivot = arr[0]
  tail = arr[1:]

  left = [x for x in tail if x < pivot]
  right = [x for x in tail if x > pivot]

  return quick_sort(left) + [pivot] + quick_sort(right)

new_arr = quick_sort(arr)

for i in new_arr:
  print(i)