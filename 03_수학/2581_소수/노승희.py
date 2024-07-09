# 언어 : Python , (성공/실패) : 1/2, 메모리 : 31120 KB , 시간 : 576 ms
import sys
input = sys.stdin.readline

M = int(input())
N = int(input())
sosu = []
    
for num in range(M, N+1):
  not_prime = 0
  if num > 1:
    for j in range(2, num):
      if (num % j == 0): # 소수가 아니면
        not_prime += 1
        break
    if not_prime == 0:
      sosu.append(num)

if len(sosu) > 0:
  print(sum(sosu))
  print(sosu[0])
else:
  print(-1)