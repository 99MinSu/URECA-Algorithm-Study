# 언어 : Python , (성공/실패) : 1/4, 메모리 : 36204 KB , 시간 : 452 ms
import sys
from functools import reduce
from math import gcd

input = sys.stdin.readline
N = int(input()) 
A = list(map(int, input().rstrip().split())) # 길이가 N인 수열 A

# 수열 A에서 소수만 골라서 넣음
prime_list = [i for i in A if is_prime(i)]

# 소수 판별 함수
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1): 
        if n % i == 0: # 약수가 존재하면 소수가 아님 
            return False
    return True

# 최소공배수 계산
def lcm(a, b):
    return a * b // gcd(a, b)

# 비어있다면 -1을 출력
if not prime_list:
    print(-1)
else:
    result = reduce(lcm, prime_list)
    print(result)

# 최소 공배수 계산 : a * b // gcd(a, b) ==  두 수의 곱 // 두 수의 최대 공약수
# gcd 함수 : 두 정수의 최대 공약수를 계산하는 함수
# reduce 함수 : 함수의 누적 계산을 수행할 때 사용
# > reduce 함수로 전체 소수의 최소 공배수 계산