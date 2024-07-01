import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

N = int(input())
arr = []

for i in range(N):
  arr.append(int(input()))

# 병합정렬
def mergeSort(arr):
  if len(arr) <= 1:
    return arr

  # 배열 반으로 나누기
  mid = len(arr) // 2

  # 나뉜 배열 각각 정렬
  left = mergeSort(arr[:mid])
  right = mergeSort(arr[mid:])

  # 다시 합치기
  return merge(left, right)

def merge(left, right):
  new_arr = []
  p1, p2 = 0, 0

  while len(left) > p1 and len(right) > p2:
      if left[p1] > right[p2]:
          new_arr.append(right[p2])
          p2 += 1
      else:
          new_arr.append(left[p1])
          p1 += 1
      
  while len(left) > p1 and len(right) <= p2:
      new_arr.append(left[p1])
      p1 += 1

  while len(right) > p2 and len(left) <= p1:
      new_arr.append(right[p2])
      p2 += 1

  return new_arr


new_arr = mergeSort(arr)

for i in new_arr:
  print(i)