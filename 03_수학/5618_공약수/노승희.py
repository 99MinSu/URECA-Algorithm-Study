# 언어 : Python , (성공/실패) : 1/3, 메모리 : 109240 KB , 시간 : 1276 ms
import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().rstrip().split()))

for i in range(1, min(arr)+1): # 1부터 min(arr)+1 까지 모든 숫자 i 반복
  flag = True
  for num in arr: # arr의 모든 요소가 i로 나누어지는지 확인
    if  num % i != 0:  # 나누어지지 않는 요소가 있다면
      flag = False # flag를 false 처리하고
      break # 중단
  if flag: # false 처리가 안된 flag는 i가 모든 숫자의 공약수라는 의미
    print(i) # 그때의 i를 출력