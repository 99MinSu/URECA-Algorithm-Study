import sys
input = sys.stdin.readline

N = int(input())
arr = set(map(int, input().split()))

is_prime = [True] * 1000001
is_prime[0] = False
is_prime[1] = False
for i in range(2, len(is_prime)):
    if is_prime[i]:
        for j in range(i*i, len(is_prime), i):
            is_prime[j] = False

result = 1
for i in arr:
    if is_prime[i]:
        result *= i

if result == 1:
    print(-1)
else:
    print(result)
