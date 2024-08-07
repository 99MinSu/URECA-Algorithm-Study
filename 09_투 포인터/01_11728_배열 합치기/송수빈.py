import sys

input = sys.stdin.readline 
n, m = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

res = A + B
res.sort()

for i in res:
    print(i, end=" ")
