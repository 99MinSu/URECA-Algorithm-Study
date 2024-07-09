# 언어 : Python , (성공/실패) : 1/0, 메모리 : 46140 KB , 시간 : 264 ms
import sys
input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
  age, name = map(str, input().rstrip().split())
  arr.append((int(age), name))

arr.sort(key = lambda x : (x[0])) # 나이를 기준으로 정렬
 
for i in arr:
  print(i[0], i[1])