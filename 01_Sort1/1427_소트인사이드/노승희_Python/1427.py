# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 40 ms
import sys
input = sys.stdin.readline

N = input().rstrip()
arr =[]

for i in N:
  arr.append(int(i))

sortArr = sorted(arr, reverse=True)
print(''.join(map(str, sortArr)))