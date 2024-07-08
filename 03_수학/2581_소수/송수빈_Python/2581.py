N = int(input())
M = int(input())

primes = [] #소수 리스트 

for num in range(N, M + 1):
    if num < 2:
        continue  #2보다 작으면 소수가 아니므로 생략 
    is_prime = True
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            is_prime = False
            break
    if is_prime:
        primes.append(num)

# 소수 리스트 출력
if len(primes) > 0:
    print(sum(primes)) 
    print(min(primes))
else:
    print(-1)
