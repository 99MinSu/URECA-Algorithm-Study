# 언어 : Python , (성공/실패) : 1/3, 메모리 : 31120 KB , 시간 : 40 ms
import sys
input = sys.stdin.readline

# 4. 최대공약수를 구하는 함수 (유클리드 호제법)
def gcd(a, b):
    while b != 0: # b가 0이 될 때까지 
        a, b = b, a % b # a, b의 나머지를 반복적으로 계산하여
    return a # 최종적으로 a 반환

# 3. 최소공배수를 구하는 함수
def lcm(a, b):
    # 두 자연수의 곱 // 최대 공약수 ==> 최소공배수
    return a * b // gcd(a, b)

# 1. 테스트 케이스의 수를 입력받음
T = int(input())

# 2. 각 테스트 케이스에 대해 최소공배수를 구함
for _ in range(T):
    a, b = map(int, input().rstrip().split())
    print(lcm(a, b))