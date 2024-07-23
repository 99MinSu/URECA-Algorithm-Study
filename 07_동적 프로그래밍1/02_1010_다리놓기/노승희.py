# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 40 ms
def factorial(n):
    num = 1
    for i in range(1, n+1):
        num *= i
    return num

T = int(input())

for _ in range(T):
    n, m = map(int, input().split())
    bridge = factorial(m) // (factorial(n) * factorial(m - n))
    print(bridge)

# 조합 = 서로 다른 m개 중에 n개를 선택하는 경우의 수
# m이 n보다 크기 때문에 최대 연결할 수 있는 다리의 개수는 n개
# m개의 지역에 n개의 다리를 놓을 수 있는 경우의 수를 구하는 것이기 때문에
# mCn 으로 표현할 수 있고 이는 m! 을 (m-n)!n! 으로 나눈 값이 됨.