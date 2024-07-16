# 언어 : Python , (성공/실패) : 1/1, 메모리 : 35364 KB , 시간 : 108 ms
import sys
input = sys.stdin.readline

N = int(input())
arrK = [int(input()) for _ in range(N)]

arrK.sort(reverse=True) # 최대 중량 기준으로 내림차순

max_weight = 0

for i in range(N):
  # 1~N개의 로프를 사용할 때 최대 중량 계산 
  # 병렬로 사용하면, 가장 약한 로프가 기준이 되기 때문에, arrK[i] * (i+1)인 것 
  max_weight = max(max_weight, arrK[i] * (i+1))

print(max_weight)