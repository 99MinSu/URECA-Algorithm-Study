# 언어 : Python , (성공/실패) : 1/1, 메모리 : 31120 KB , 시간 : 36 ms
import sys
input = sys.stdin.readline

N = int(input())
number = list(map(int, input().rstrip().split()))
cnt = 0

for num in number:
  if num == 1: continue

  for j in range(2, num):
    if num % j == 0: # 약수가 존재하면 소수가 아님
      break
  
  else: # 소수일 때 
    cnt += 1 
  
print(cnt)