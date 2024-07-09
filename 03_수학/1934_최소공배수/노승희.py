# 언어 : Python , (성공/실패) : 1/3, 메모리 : 31120 KB , 시간 : 40 ms
import sys
input = sys.stdin.readline

# 최대공약수를 구하는 함수 (유클리드 호제법)
def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

# 최소공배수를 구하는 함수
def lcm(a, b):
    return a * b // gcd(a, b)

# 테스트 케이스의 수를 입력받음
T = int(input())

# 각 테스트 케이스에 대해 최소공배수를 구함
for _ in range(T):
    a, b = map(int, input().rstrip().split())
    print(lcm(a, b))
