# 언어 : Python , (성공/실패) : 1/0, 메모리 : 35732 KB , 시간 : 60 ms
import sys
input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
  arr.append(input().rstrip())

arr = list(set(arr)) # 중복제거
arr.sort() # 사전 순으로 정렬
arr.sort(key = lambda x : (len(x))) # 길이 비교 후 정렬

for i in arr:
  print(i)